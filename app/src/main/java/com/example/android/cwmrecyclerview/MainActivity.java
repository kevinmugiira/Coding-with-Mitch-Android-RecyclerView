package com.example.android.cwmrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variable declaration
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.shopify.com%2Fs%2Ffiles%2F1%2F2341%2F3995%2Farticles%2FWaterfall-Plitvice_1024x768.progressive.jpg%3Fv%3D1552412830&imgrefurl=https%3A%2F%2Fwww.tentree.com%2Fblogs%2Fposts%2Fthe-10-most-beautiful-places-in-the-world&tbnid=Gg685YRlXhN9nM&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygFegUIARCGAg..i&docid=Mu8Bd_5j1bQZTM&w=700&h=466&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygFegUIARCGAg");
        mNames.add("Tentree");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.elitereaders.com%2Fwp-content%2Fuploads%2F2016%2F02%2Fcavernas-chile-featured.jpg&imgrefurl=https%3A%2F%2Fwww.elitereaders.com%2Fmost-beautiful-places-world-you-didnt-know-existed%2F&tbnid=2ho9s6JfdBYw4M&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygRegUIARCfAg..i&docid=RXGB-HlDzb1xdM&w=1200&h=630&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygRegUIARCfAg");
        mNames.add("Elite Readers");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fthumbor.forbes.com%2Fthumbor%2F960x0%2Fhttps%253A%252F%252Fblogs-images.forbes.com%252Ftrevornace%252Ffiles%252F2015%252F11%252Frainbow-mountains-zhangye-danxia-1200x799.jpg&imgrefurl=https%3A%2F%2Fwww.forbes.com%2Fsites%2Ftrevornace%2F2015%2F11%2F27%2F21-most-beautiful-places-in-the-world-visit%2F&tbnid=uCF_1PO8qJed3M&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygWegQIARBC..i&docid=6j85v5dogULEqM&w=960&h=639&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygWegQIARBC");
        mNames.add("Forbes hehe");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.jetsetter.com%2Fuploads%2Fsites%2F7%2F2018%2F04%2F9s9_ATCO.jpeg&imgrefurl=https%3A%2F%2Fwww.jetsetter.com%2Fmagazine%2Fmost-beautiful-places-in-the-world%2F&tbnid=mUvgg-snasr5JM&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygYegQIARBN..i&docid=745G3m4VyFAOFM&w=3072&h=2050&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygYegQIARBN");
        mNames.add("Jetsetter");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fimageresizer.static9.net.au%2FKoNDnm0VtnioEFoR5eZC2EcBtiE%3D%2F400x0%2Fhttps%253A%252F%252Fprod.static9.net.au%252Ffs%252F206af8fb-96c8-4cd0-b6e9-4ac7c2ed55bd&imgrefurl=https%3A%2F%2Ftravel.nine.com.au%2Fdestinations%2F25-most-beautiful-places-in-the-world%2F920e8a70-31cb-4d04-9137-6ade0ab85190&tbnid=0dRGV0sZ2JQFDM&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMyglegQIARBn..i&docid=ZmzIYMk30FC2aM&w=400&h=267&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMyglegQIARBn");
        mNames.add("TravelNine");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.polkadotpassport.com%2Fwp-content%2Fuploads%2F2015%2F10%2FIMG_1124.jpg&imgrefurl=https%3A%2F%2Fwww.polkadotpassport.com%2Fthe-14-most-beautiful-places-in-the-world%2F&tbnid=19gZK-SrSzBgaM&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygkegQIARBl..i&docid=dXFXsEO4CbRpzM&w=5472&h=3648&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygkegQIARBl");
        mNames.add("Polkado");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.cntraveler.com%2Fphotos%2F5cb63a5211a45eb1f830373c%2Fmaster%2Fpass%2FWulingyuan-Scenic-Area-China_GettyImages-159228516.jpg&imgrefurl=https%3A%2F%2Fwww.cntraveler.com%2Fgalleries%2F2015-11-27%2Fthe-50-most-beautiful-places-in-the-world&tbnid=coczZbId_4gNdM&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygregQIARBz..i&docid=qxUl8pS5C84QkM&w=4000&h=2670&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygregQIARBz");
        mNames.add("CNtraveler");

        mImageUrls.add("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwentworld.com%2Fwp-content%2Fuploads%2F2019%2F02%2F10.Palawan-Island-Philippines.jpg&imgrefurl=https%3A%2F%2Fwentworld.com%2Ftop-10-most-beautiful-places-in-the-world-in-2019%2F&tbnid=KAYeYXMaCq5O0M&vet=12ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygsegQIARB1..i&docid=HN3bYjws-GkC-M&w=933&h=1160&q=images%20of%20the%20most%20beautiful%20places%20in%20the%20world&client=ubuntu&ved=2ahUKEwjjnarQ_NPoAhVX8IUKHaJZAGcQMygsegQIARB1");
        mNames.add("Wetworld");

        initRecyclerView();
        
    }
    
    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");

        RecyclerView recyclerv = findViewById(R.id.recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerv.setAdapter(recyclerViewAdapter);
        recyclerv.setLayoutManager(new LinearLayoutManager(this));
        
        
    }

}
