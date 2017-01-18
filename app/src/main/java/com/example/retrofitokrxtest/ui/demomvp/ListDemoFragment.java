package com.example.retrofitokrxtest.ui.demomvp;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.base.app.R;
import com.baseapp.model.entity.ListBean;
import com.baseapp.mvp.BaseMvpFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.utils.sreen.DensityUtil;

import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;
import in.srain.cube.views.ptr.header.StoreHouseHeader;

/**
 *
 */
public class ListDemoFragment extends BaseMvpFragment<PDemoO1> {


    @BindView(R.id.recycle_view)
    RecyclerView recycleView;
    @BindView(R.id.ptr_frame_layout)
    PtrClassicFrameLayout ptrFrameLayout;
    private MyAdapter  adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_item_list;
    }

    @Override
    protected void initData() {
        super.initData();
        List<ListBean> data = new LinkedList<>();
        for (int i =0; i<10 ;i++){
            ListBean  bean = new ListBean();
            bean.title = "i:" +i;
            data.add(bean);
        }
        adapter = new MyAdapter(R.layout.fragment_item,data);
        recycleView.setAdapter(adapter);

        ptrFrameLayout.setLastUpdateTimeRelateObject(this);
        ptrFrameLayout.setPtrHandler(new PtrHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, recycleView, header);
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
               frame.postDelayed(new Runnable() {
                   @Override
                   public void run() {
                     ptrFrameLayout.refreshComplete();
                   }
               },1000);
            }
        });

        final StoreHouseHeader header = new StoreHouseHeader(getContext());
        header.setPadding(0, DensityUtil.dip2px(getContext(), 15), 0, 0);
        header.setTextColor(Color.BLACK);
        header.initWithString("vp-Honor");
        ptrFrameLayout.setHeaderView(header);
        ptrFrameLayout.addPtrUIHandler(header);
        adapter.setEnableLoadMore(true);
        adapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {

                recycleView.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if (adapter.getData().size()==40){
                            adapter.loadMoreFail();
                        }
                        List<ListBean> data = new LinkedList<>();
                        for (int i =0; i<10 ;i++){
                            ListBean  bean = new ListBean();
                            bean.title = "i:" +i;
                            data.add(bean);
                        }
                        adapter.getData().addAll(data);
                        if (adapter.getData().size() >=100){
                            //adapter.lo
                            adapter.loadMoreEnd();
                        }else {
                            adapter.loadMoreComplete();
                        }
                    }
                },1000);

            }
        });

    }




    class MyAdapter extends BaseQuickAdapter<ListBean,BaseViewHolder> {

        public MyAdapter(int layoutResId, List<ListBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder baseViewHolder, ListBean listBean) {
            baseViewHolder.setText(R.id.content,listBean.title);
        }
    }
}
