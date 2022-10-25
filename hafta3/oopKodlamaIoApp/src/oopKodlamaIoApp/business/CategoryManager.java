package oopKodlamaIoApp.business;

import oopKodlamaIoApp.core.logging.Logger;
import oopKodlamaIoApp.dataAccess.CategoryDao;
import oopKodlamaIoApp.entities.Category;

import java.util.ArrayList;

public class CategoryManager {
    private ArrayList<String> categories = new ArrayList<String>();
    private Logger[] loggers;
    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers=loggers;
    }

    public void add(Category category) throws Exception {

        if(categories.contains(category.getCategoryName())){
            throw new Exception("Aynı kategori ismi zaten var!!");
        }

        categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }
}
