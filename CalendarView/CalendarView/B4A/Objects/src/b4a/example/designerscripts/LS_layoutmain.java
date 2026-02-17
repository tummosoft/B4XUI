package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutmain{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlbg").vw.setLeft((int)(0d));
views.get("pnlbg").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlbg").vw.setHeight((int)((100d / 100 * height)));
views.get("pnlbg").vw.setTop((int)(0d));
views.get("pnlwrapper").vw.setWidth((int)((100d / 100 * width)-(40d * scale)));
views.get("pnlwrapper").vw.setLeft((int)((20d * scale)));
views.get("pnlwrapper").vw.setHeight((int)((360d * scale)));
views.get("pnlwrapper").vw.setTop((int)(((100d / 100 * height)-(views.get("pnlwrapper").vw.getHeight()))/2d));

}
}