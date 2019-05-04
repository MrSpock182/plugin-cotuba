import cotuba.plugin.PluginCotuba;

public class KlebinhoPlugin implements PluginCotuba {

    @Override
    public String css() {
        return FileUtils.getResourceContents("/tema.css");
    }
}
