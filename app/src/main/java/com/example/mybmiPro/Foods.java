package com.example.mybmiPro;

public class Foods {

    String categoryFoodsName;
    String claryFoods;int idCategoryFoods;
    String dIDFoods;String uId;String nameFoods;
    String FBUri;


    public Foods() {
    }

    public Foods(String uId, String claryFoods, String nameFoods, String FBUri, String categoryFoodsName, String dIDFoods, int idCategoryFoods) {
        this.uId = uId;

        this.FBUri = FBUri;this.categoryFoodsName = categoryFoodsName;
        this.claryFoods = claryFoods;
        this.nameFoods = nameFoods;this.dIDFoods = dIDFoods;
        this.idCategoryFoods = idCategoryFoods;
    }

    public int getIdCategoryFoods() {
        return idCategoryFoods;
    }



    public String getdIDFoods() {
        return dIDFoods;
    }



    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuId() {
        return uId;
    }

    public String getCategoryFoodsName() {
        return categoryFoodsName;
    }

    public void setCategoryFoodsName(String categoryFoodsName) {
        this.categoryFoodsName = categoryFoodsName;
    }

    public String getClaryFoods() {
        return claryFoods;
    }
    public void setNameFoods(String nameFoods) {
        this.nameFoods = nameFoods;
    }

    public String getFBUri() {
        return FBUri;
    }

    public void setFBUri(String FBUri) {
        this.FBUri = FBUri;
    }
    public void setClaryFoods(String claryFoods) {
        this.claryFoods = claryFoods;
    }

    public String getNameFoods() {
        return nameFoods;
    }


}

