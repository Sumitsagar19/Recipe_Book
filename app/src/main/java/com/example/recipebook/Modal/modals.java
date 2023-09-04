package com.example.recipebook.Modal;

public class modals {
    String name;

    String Ingredients;
    String Instruction;
    int img;

    public modals(String name, String ingredients, String instruction, int img) {
        this.name = name;
        Ingredients = ingredients;
        Instruction = instruction;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getInstruction() {
        return Instruction;
    }

    public void setInstruction(String instruction) {
        Instruction = instruction;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
