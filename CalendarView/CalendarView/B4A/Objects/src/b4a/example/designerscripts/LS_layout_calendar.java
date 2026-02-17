package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout_calendar{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlbackground").vw.setWidth((int)((100d / 100 * width)-(20d * scale)));
views.get("pnlbackground").vw.setLeft((int)((10d * scale)));
views.get("pnlbackground").vw.setHeight((int)((290d * scale)));
views.get("pnlbackground").vw.setTop((int)(((100d / 100 * height)-(views.get("pnlbackground").vw.getHeight()))/2d));
views.get("pnlmonth").vw.setTop((int)(0d));
views.get("pnlmonth").vw.setWidth((int)((views.get("pnlbackground").vw.getWidth())));
views.get("pnlmonth").vw.setLeft((int)(0d));
views.get("pnlmonth").vw.setHeight((int)((40d * scale)));
views.get("lblmonth").vw.setWidth((int)((views.get("pnlbackground").vw.getWidth())));
//BA.debugLineNum = 15;BA.debugLine="lblMonth.Left = 0"[layout_calendar/General script]
views.get("lblmonth").vw.setLeft((int)(0d));
//BA.debugLineNum = 17;BA.debugLine="pnlWeek.Width = pnlBackground.Width - 6dip"[layout_calendar/General script]
views.get("pnlweek").vw.setWidth((int)((views.get("pnlbackground").vw.getWidth())-(6d * scale)));
//BA.debugLineNum = 18;BA.debugLine="pnlWeek.Height = 30dip"[layout_calendar/General script]
views.get("pnlweek").vw.setHeight((int)((30d * scale)));
//BA.debugLineNum = 19;BA.debugLine="pnlWeek.Left = 3dip"[layout_calendar/General script]
views.get("pnlweek").vw.setLeft((int)((3d * scale)));
//BA.debugLineNum = 20;BA.debugLine="pnlWeek.Top = pnlMonth.Top + pnlMonth.Height + 5dip"[layout_calendar/General script]
views.get("pnlweek").vw.setTop((int)((views.get("pnlmonth").vw.getTop())+(views.get("pnlmonth").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 22;BA.debugLine="pnlDays.Width = pnlBackground.Width - 6dip"[layout_calendar/General script]
views.get("pnldays").vw.setWidth((int)((views.get("pnlbackground").vw.getWidth())-(6d * scale)));
//BA.debugLineNum = 23;BA.debugLine="pnlDays.Height = 200dip"[layout_calendar/General script]
views.get("pnldays").vw.setHeight((int)((200d * scale)));
//BA.debugLineNum = 24;BA.debugLine="pnlDays.Left = 3dip"[layout_calendar/General script]
views.get("pnldays").vw.setLeft((int)((3d * scale)));
//BA.debugLineNum = 25;BA.debugLine="pnlDays.Top = pnlWeek.Top + pnlWeek.Height + 10dip"[layout_calendar/General script]
views.get("pnldays").vw.setTop((int)((views.get("pnlweek").vw.getTop())+(views.get("pnlweek").vw.getHeight())+(10d * scale)));

}
}