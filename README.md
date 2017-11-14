
Usage
-----

1.Place the `AnimationListView` on your layout:

```xml
    <com.chinnadurai.android.animation.lib.AnimationListView
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@android:id/list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

2.Populate it with items which xml layout is wrap by a `AnimationLayout`:


```xml
    <!--Notice that this view extends from <FrameLayout/>.-->
    <com.chinnadurai.android.animation.lib.AnimationLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/apk/tools"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:orientation="vertical">

        <!--Your content-->

    </AnimationLayout>
```
3.Set the color of each item. It needs to be set on the getView method of your adapter calling `setAnimationLayoutColor` from `AnimationLayout`:

```java
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        int color = Color.argb(255, mRandomizer.nextInt(256), mRandomizer.nextInt(256), mRandomizer.nextInt(256));
        ((FlabbyLayout)convertView).setFlabbyColor(color);
        holder.text.setText(getItem(position));
        return convertView;
    }
```
