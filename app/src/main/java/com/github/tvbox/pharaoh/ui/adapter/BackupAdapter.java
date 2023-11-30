package com.github.tvbox.pharaoh.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.tvbox.pharaoh.R;

import java.util.ArrayList;

public class BackupAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public BackupAdapter() {
        super(R.layout.item_dialog_backup, new ArrayList<>());
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tvName, item);
        helper.addOnClickListener(R.id.tvName);
    }
}