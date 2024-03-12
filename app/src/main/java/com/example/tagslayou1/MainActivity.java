package com.example.tagslayou1;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.ClipData;

import android.content.DialogInterface;

import android.graphics.Color;

import android.graphics.Typeface;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.Toast;




import java.util.ArrayList;
import java.util.List;

import co.lujun.androidtagview.ColorFactory;
import co.lujun.androidtagview.TagContainerLayout;
import co.lujun.androidtagview.TagView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TagContainerLayout mTagContainerLayout1, mTagContainerLayout2, mTagContainerLayout3, mTagContainerLayout4, mTagContainerLayout5;
    private String[]city={"همدان" , "ملایر","نهاوند","لالجین" ,"تویسرکان",  "سرکان ,","سامن","فرسفج","ورامین","تهران","دماوند","لواسان",
            "اسلامشهر","فیروزکوه","دربندسر","سولقان","رودبار قصران","رباط کریم","طالقان","کرج","هشتگرد","کردان","نظرآباد","شهرستانک",
            "قزوین","ابهر","تاکستان","بوئین زهرا","ابگرم قزوین","سرعین","اردبیل","مشگین شهر","خلخال","نیر","پارس آباد","گرمی","عنبران",
            "رضی","نمین","بیله سوار","گرگان","بندرترکمن","کلاله","علی آباد کتول","گنبد کاووس","رامیان","مینودشت","گالیکش","آزادشهر",	"مرواه تپه",
            "کردکوی"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Typeface tf= Typeface.createFromAsset(getAssets(),"font/farkoodak.ttf");
        List<String> list1 = new ArrayList<String>();
        list1.add( "تجهیزات آرایشگری" );
        list1.add( "لباس پوشاک" );
        list1.add( "غذا و خوراک" );
        list1.add( "تجهیزات پزشکی");

        List<String> list2 = new ArrayList<String>();
        list2.add( "اسباب بازی فروشی" );
        list2.add( "خوشکبار" );
        list2.add( "سوپرمارکتی" );
        list2.add( "کفش" );


        String[] list3 = new String[]{"کاپشن", "لباس زیر"};
        String[] list4 = new String[]{"گوسفند", "مرغ "};
        List<String> list5 = new ArrayList<String>();
        list5.add( "ماشین اصلاح" );
        list5.add( "لباس بچگانه" );
        list5.add( "متور ماشین" );
        list5.add( "اسباب بازی" );

        intiti();
        layout3();
        spinner();
        mTagContainerLayout1.setTags( list1 );
        mTagContainerLayout1.setTagTextDirection(View.TEXT_DIRECTION_RTL);
        mTagContainerLayout1.setTagTypeface( tf);
        mTagContainerLayout1.setTheme(ColorFactory.PURE_CYAN);
        mTagContainerLayout1.setTheme(ColorFactory.NONE);
        mTagContainerLayout1.setTagBackgroundColor(Color.TRANSPARENT);
        mTagContainerLayout2.setTags( list2 );
        mTagContainerLayout2.setTagTypeface( tf);
        mTagContainerLayout2.setTagTextDirection(View.TEXT_DIRECTION_RTL);

        mTagContainerLayout3.setTags( list3 );
        mTagContainerLayout3.setTagTypeface( tf);
        mTagContainerLayout3.setTagTextDirection(View.TEXT_DIRECTION_RTL);

        mTagContainerLayout4.setTags( list4 );
        mTagContainerLayout4.setTagTypeface( tf);
        mTagContainerLayout4.setTagTextDirection(View.TEXT_DIRECTION_RTL);



        List<int[]> colors = new ArrayList<int[]>();

        int[] col1 = {Color.parseColor( "#ff0000" ),
                Color.parseColor( "#000000" ), Color.parseColor( "" +
                "#ffffff" ), Color.parseColor( "#999999" )};
        int[] color2 = {Color.parseColor( "#0000ff" ),
                Color.parseColor( "#000000" ),
                Color.parseColor( "#ffffff" ),
                Color.parseColor( "#999999" )};

        colors.add( col1 );
        colors.add( color2 );


        final EditText text =(EditText) findViewById( R.id.text_tag );

        text.setTypeface( tf);
                Button btnaddTag =(Button) findViewById( R.id.btn_add_tag );
        btnaddTag.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTagContainerLayout1.addTag( text.getText().toString() );

            }
        } );
        //   mTagContainerLayout1.setMaxLines( 1 );
        //   RecyclerView recyclerView = findViewById( R.id.recyclerView );
        ///   recyclerView.setVisibility( View.VISIBLE );
        //   TagRecyclerViewAdapter adapter = new TagRecyclerViewAdapter( this, list3 );
        //   adapter.setOnClickListener( new View.OnClickListener() {
        //       @Override
        //      public void onClick(View v) {
        //          Toast.makeText( MainActivity.this, "Click on TagContainerLayout", Toast.LENGTH_SHORT ).show();
        ///      }
        //  } );
        //  recyclerView.setAdapter( adapter );


    }
    // private void loadImage (List<String>list){
    // String[]avatars=new String[]{"https://forums.oneplus.com/data/avatars/m/231/231279.jpg",
    //   "https://d1marr3m5x4iac.cloudfront.net/images/block/movies/17214/17214_aa.jpg",
    //     "https://lh3.googleusercontent.com/-KSI1bJ1aVS4/AAAAAAAAAAI/AAAAAAAAB9c/Vrgt6WyS5OU/il/photo.jpg" };
    //for (int i=0;i<list.size();i++){
    //  final int index=i;
    //     Glide.with(mTagContainerLayout1.getContext())
    //               .load("http://via.placeholder.com/300.png")
    //                 .placeholder(R.drawable.placeholder)
    //                   .error(R.drawable.imagenotfound)
//
    //           .override(100, Target.SIZE_ORIGINAL)
    //             .listener( new RequestListener<Drawable>() {
    //                   @Override
    //                     public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
    //                           Log.e("TAG", "Error loading image", e);
//
    //      return false;
    //    }

    //      @Override
    //        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
    //              return false;
    //            }
    //          })
    //           .into( ivImg);


    // }
    //  }
    private void intiti() {
        mTagContainerLayout1 = findViewById( R.id.tagcontainerLayout1 );
        mTagContainerLayout2 = findViewById( R.id.tagcontainerLayout2 );
        mTagContainerLayout3 = findViewById( R.id.tagcontainerLayout3 );
        mTagContainerLayout4 = findViewById( R.id.tagcontainerLayout4 );
        mTagContainerLayout5 = findViewById( R.id.tagcontainerLayout5 );
        mTagContainerLayout1.setOnTagClickListener( new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text) {

                Toast.makeText( MainActivity.this, "click_position" + position + ",text" + text, Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onTagLongClick(final int position, String text) {
                mTagContainerLayout1.removeTag( position);         //حذف کردن tag view
            }

            @Override
            public void onSelectedTagDrag(int position, String text) {
                AlertDialog dialog = new AlertDialog.Builder( MainActivity.this )
                        .setTitle( "long Click" )
                        .setMessage( "You will delete this tag!" )
                        .setPositiveButton( "Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (position < mTagContainerLayout1.getChildCount()) {
                                    mTagContainerLayout1.removeTag( position );

                                }
                            }
                        } )
                        .setNegativeButton( "cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        } ).create();

            }

            @Override
            public void onTagCrossClick(int position) {
                //  mTagContainerLayout1.removeTag( position);
                Toast.makeText( MainActivity.this, "Click tagView cross!position=" + position, Toast.LENGTH_SHORT ).show();

            }
        } );
    }

    private void layout3() {
        mTagContainerLayout3.setOnTagClickListener( new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text) {

                List<Integer> selectPosition = mTagContainerLayout3.getSelectedTagViewPositions();
                //deselect all tags click  on an unselected tag. Otherwise show toast
                if (selectPosition.isEmpty() || selectPosition.contains( position )) {
                    Toast.makeText( MainActivity.this, "click position" + position + ",text" + text, Toast.LENGTH_SHORT ).show();
                } else {
                    //deselect all tag
                    for (int i : selectPosition) {
                        mTagContainerLayout3.deselectTagView( i );

                    }
                }
            }

            @Override
            public void onTagLongClick(final int position, String text) {
                mTagContainerLayout3.toggleSelectTagView( position );
                List<Integer> selectPosition = mTagContainerLayout3.getSelectedTagViewPositions();
                Toast.makeText( MainActivity.this, "selectedPosition:" + selectPosition.toString(), Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onSelectedTagDrag(int position, String text) {
                ClipData clip = ClipData.newPlainText( "text", text );
                View view = mTagContainerLayout3.getTagView( position );
                View.DragShadowBuilder shadow = new View.DragShadowBuilder( view );
                view.startDrag( clip, shadow, Boolean.TRUE, 0 );
            }

            @Override
            public void onTagCrossClick(int position) {

            }
        } );

    }
    private void spinner(){
        Spinner spinner=findViewById( R.id.simpleSpinner);
        spinner.setOnItemSelectedListener(  this );
        ArrayAdapter adapter=new ArrayAdapter( this, android.R.layout.simple_spinner_item,city);
        spinner.setAdapter( adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), city[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}