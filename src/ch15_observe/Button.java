package ch15_observe;

public class Button {
    public void onClick(){
        if(onClickListener != null){
            onClickListener.onClick(this);
        }
    }
    interface OnClickListener{
        void onClick(Button button);
    }


    private OnClickListener onClickListener;
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @Override
    public String toString() {
        return "클릭";
    }
}

