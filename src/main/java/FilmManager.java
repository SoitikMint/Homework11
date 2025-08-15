public class FilmManager {

    private FilmItem[] items = new FilmItem[0];
    private int showLimit;

    public FilmManager() {
        this.showLimit = 5;
    }

    public FilmManager(int showLimit) {
        this.showLimit = showLimit;
    }

    public void add(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeLast() {
        FilmItem[] tmp = new FilmItem[items.length - 1];
        for (int i = 0; i < items.length - 1; i++) {
            tmp[i] = items[i];
        }
        items = tmp;
    }

    public void removeById(int id) {
        FilmItem[] tmp = new FilmItem[items.length - 1];
        int indexToCopy = 0;
        for (FilmItem item : items) {
            if (item.getId() != id) {
                tmp[indexToCopy] = item;
                indexToCopy++;
            }
        }
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLastAdded() {
        FilmItem[] all = findAll();
        int allLength = all.length;
        int resultLength;
        if (allLength >= showLimit) {
            resultLength = showLimit;
        } else {
            resultLength = allLength;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[allLength - 1 - i];
        }
        return result;
    }
}
