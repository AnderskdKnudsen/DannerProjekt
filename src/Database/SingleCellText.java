package Database;

/**
 * Created by Anders on 09-May-17.
 */
public class SingleCellText
{
    private int cat_id;
    private String text;

    public SingleCellText(int cat_id, String text)
    {
        this.cat_id = cat_id;
        this.text = text;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
