/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddithottopicsanalyser;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author user
 */
public class IndexListModel extends AbstractListModel <RedditWordItem>{
    
    ArrayList<RedditWordItem> indexList = new ArrayList<>();
    ArrayList<RedditThing> rtList = new ArrayList<>();
//    RedditThingSort indexSort = new RedditThingSort();

    @Override
    public int getSize() {
        return indexList.size();
    }

    @Override
    public RedditWordItem getElementAt(int i) {
        return indexList.get(i);
    }
    
    public void setrtList (ArrayList<RedditThing> list){
        this.rtList = list;
    }    
    
     public void setData (ArrayList<RedditWordItem> list) {
        this.indexList = list;
    }
    
    public void addElement (RedditWordItem rt) {
        this.indexList.add(rt);
        fireContentsChanged(this, 0, this.indexList.size());
    }
    
    public RedditWordItem get(int index) {
        return indexList.get(index);
    }
    
    public String search(String s){
        try{
        for(int i=0; i<indexList.size();i++){
            RedditThingIndexer rti = new RedditThingIndexer(rtList);
            rti.index();
            RedditWordItem rwi = rti.getWordItem(s);
            String str = rwi.getWord();
            if(str.matches(s)){
                return rti.getWordItem(s).toString();
            }else{
                return "false";
            }
            
        }
        }catch(NullPointerException npe){
            return "No such word in index.";
        }
        return "Please create an index of word first.";
    }
    
}
