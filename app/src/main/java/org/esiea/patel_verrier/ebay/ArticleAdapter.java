package org.esiea.patel_verrier.ebay;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import static java.security.AccessController.getContext;

/**
 * Created by patel_verrier on 20/05/2018.
 */

class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleHolder> {
    private JSONArray articles;
    public ArticleAdapter (JSONArray articles){
        this.articles=articles;
    }

    @Override
    public ArticleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater lI = LayoutInflater.from(parent.getContext());
        View view = lI.inflate(R.layout.rv_article_element,parent,false);
        return new ArticleHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleHolder holder, int position) {
        try {
            holder.name.setText(articles.getJSONObject(position).getString("name"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        if(articles != null) {
            return articles.length();
        }
        else{
            return 0;
        }
    }

    public class ArticleHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ArticleHolder(View view) {
            super(view);
            this.name=(TextView) view.findViewById(R.id.rv_article_element_name);
        }
    }

    public void setNewArticle (JSONArray newArticle){
        this.articles=newArticle;
        notifyDataSetChanged();
        Log.d("TAG", String.valueOf(getItemCount()));
    }


}


