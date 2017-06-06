package com.shakuro.firebase;

import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.support.v7.widget.RecyclerView.*;

public  class MessageViewHolder extends ViewHolder {
        public TextView messageTextView;
        public TextView messengerTextView;
        public CircleImageView messengerImageView;

        public MessageViewHolder(View v) {
            super(v);
            messageTextView = (TextView) itemView.findViewById(R.id.messageTextView);
            messengerTextView = (TextView) itemView.findViewById(R.id.userTextView);
            messengerImageView = (CircleImageView) itemView.findViewById(R.id.userImageView);
        }
    }
