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
//BA.debugLineNum = 4;BA.debugLine="BottomNavigationView1.Left = 0"[MainPage/General script]
views.get("bottomnavigationview1").vw.setLeft((int)(0d));
//BA.debugLineNum = 5;BA.debugLine="BottomNavigationView1.Top = 100%y - 50dip"[MainPage/General script]
views.get("bottomnavigationview1").vw.setTop((int)((100d / 100 * height)-(50d * scale)));
//BA.debugLineNum = 6;BA.debugLine="BottomNavigationView1.Width = 100%x"[MainPage/General script]
views.get("bottomnavigationview1").vw.setWidth((int)((100d / 100 * width)));

}
}