/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithm.ssGSEA;

/**
 * <p>SetdataTerm</p>
 * <p>Created on 2015-10-17 11:03:08</p>
 * <p>Author Email: zhaoqi3@mail2.sysu.edu.cn</p>
 * @author ZHAO Qi
 * @date 2015-10-17 11:03:08
 * @version java 1.6.0
 * @version 
 */
public class SetdataTerm {
    
    private String GeneName;
    private double FoldChange;
    private int Rank;

    public SetdataTerm(String GeneName, double FoldChange) {
        this.GeneName = GeneName;
        this.FoldChange = FoldChange;
    }
    
    
    
    /**
     * Get the value of Rank
     *
     * @return the value of Rank
     */
    public int getRank() {
        return Rank;
    }

    /**
     * Set the value of Rank
     *
     * @param Rank new value of Rank
     */
    public void setRank(int Rank) {
        this.Rank = Rank;
    }


    /**
     * Get the value of FoldChange
     *
     * @return the value of FoldChange
     */
    public double getFoldChange() {
        return FoldChange;
    }

    /**
     * Set the value of FoldChange
     *
     * @param FoldChange new value of FoldChange
     */
    public void setFoldChange(double FoldChange) {
        this.FoldChange = FoldChange;
    }


    /**
     * Get the value of GeneName
     *
     * @return the value of GeneName
     */
    public String getGeneName() {
        return GeneName;
    }

    /**
     * Set the value of GeneName
     *
     * @param GeneName new value of GeneName
     */
    public void setGeneName(String GeneName) {
        this.GeneName = GeneName;
    }


}
