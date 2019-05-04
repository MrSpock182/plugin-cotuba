import cotuba.plugin.PluginCss;

public class KlebinhoPlugin implements PluginCss {

    @Override
    public String css() {
        return FileUtils.getResourceContents("/tema.css");
    }

}
