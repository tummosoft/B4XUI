package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[MainPage/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="scrollLv.Width = 90%x"[MainPage/General script]
views.get("scrolllv").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="scrollLv.Height = 90%y"[MainPage/General script]
views.get("scrolllv").vw.setHeight((int)((90d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="scrollLv.Left = 5%x"[MainPage/General script]
views.get("scrolllv").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="scrollLv.Top = 5%x"[MainPage/General script]
views.get("scrolllv").vw.setTop((int)((5d / 100 * width)));

}
}