package com.study.item2;

// 영양 분석 클래스
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;              //지방
    private final int sodium;           //나트륨
    private final int carbohydrate;     //탄수화물

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        //선택 매개변수
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }


        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
