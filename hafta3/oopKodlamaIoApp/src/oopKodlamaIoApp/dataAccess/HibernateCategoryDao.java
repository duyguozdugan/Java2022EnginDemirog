package oopKodlamaIoApp.dataAccess;

import oopKodlamaIoApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hiberbate ile veri tabanına eklendi.");
    }
}
