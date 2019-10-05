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
public class ParsedListListModel extends AbstractListModel <RedditThing>{

    ArrayList<RedditThing> list = new ArrayList<>();
    RedditThingSort rtSort = new RedditThingSort();
    
    public void setData (ArrayList<RedditThing> list) {
        this.list = list;
    }
    
    public void addElement (RedditThing rt) {
        this.list.add(rt);
        fireContentsChanged(this, 0, this.list.size());
    }
    
    public RedditThing get(int index) {
        return list.get(index);
    }
    
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public RedditThing getElementAt(int i) {
        return list.get(i);
    }
    
    public void sortID() {
    rtSort.sortById(list);
    fireContentsChanged(this, 0, this.list.size());
        
}
    
    public void sortSubreddit() {
    rtSort.sortBySubreddit(list);
    fireContentsChanged(this, 0, this.list.size());
        
}
    
    public void sortTitle() {
    rtSort.sortByTitle(list);
    fireContentsChanged(this, 0, this.list.size());
        
}
    
    public void sortCreated() {
    rtSort.sortByCreated(list);
    fireContentsChanged(this, 0, this.list.size());
        
}
    
    public void sortScore() {
    rtSort.sortByScore(list);
    fireContentsChanged(this, 0, this.list.size());
        
}
    
}
