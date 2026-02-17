package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_calendarbox{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[CalendarBox/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="pnlWrapper.Width = 100%x"[CalendarBox/General script]
views.get("pnlwrapper").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="pnlWrapper.Height = pnlWrapper.Width"[CalendarBox/General script]
views.get("pnlwrapper").vw.setHeight((int)((views.get("pnlwrapper").vw.getWidth())));
//BA.debugLineNum = 6;BA.debugLine="lblBox.Left = 0"[CalendarBox/General script]
views.get("lblbox").vw.setLeft((int)(0d));
//BA.debugLineNum = 7;BA.debugLine="lblBox.Top = 0"[CalendarBox/General script]
views.get("lblbox").vw.setTop((int)(0d));
//BA.debugLineNum = 8;BA.debugLine="lblBox.Width = pnlWrapper.Width"[CalendarBox/General script]
views.get("lblbox").vw.setWidth((int)((views.get("pnlwrapper").vw.getWidth())));
//BA.debugLineNum = 9;BA.debugLine="lblBox.Height = pnlWrapper.Height"[CalendarBox/General script]
views.get("lblbox").vw.setHeight((int)((views.get("pnlwrapper").vw.getHeight())));
//BA.debugLineNum = 11;BA.debugLine="pnlBottom.Height = 100%y - pnlWrapper.Height"[CalendarBox/General script]
views.get("pnlbottom").vw.setHeight((int)((100d / 100 * height)-(views.get("pnlwrapper").vw.getHeight())));
//BA.debugLineNum = 12;BA.debugLine="pnlBottom.Top = pnlWrapper.Height"[CalendarBox/General script]
views.get("pnlbottom").vw.setTop((int)((views.get("pnlwrapper").vw.getHeight())));
//BA.debugLineNum = 13;BA.debugLine="pnlBottom.Width = 100%x"[CalendarBox/General script]
views.get("pnlbottom").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 14;BA.debugLine="pnlBottom.Left = 0"[CalendarBox/General script]
views.get("pnlbottom").vw.setLeft((int)(0d));

}
}