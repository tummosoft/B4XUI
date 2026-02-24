B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
#Event: Click ()
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Private pnlBgButton As Panel
	Private imvIcon As Label
	Dim mWidth As Int
	Dim mHeight As Int
	Private lblText As Label
	Private mRadius As Int
	Private bgColor As Int = Colors.ARGB(255,156, 207, 255)
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, lbl As Label, Props As Map)
	mBase = Base
    Tag = mBase.Tag
    mBase.Tag = Me 
  	Dim clr As Int = xui.PaintOrColorToColor(Props.Get("TextColor"))
	
	pnlBgButton.Initialize("pnlBgButton")
	
	mWidth = mBase.Width
	mHeight = mWidth
	Dim left As Int = (mBase.Width - mWidth) / 2
	mRadius = (mBase.Width / 2) - 5dip
	
	mBase.AddView(pnlBgButton, left, 0dip, mWidth, mHeight)
	pnlBgButton.As(B4XView).SetColorAndBorder(bgColor, 0dip, Colors.DarkGray, mRadius)
	
	imvIcon.Initialize("")
	pnlBgButton.AddView(imvIcon, 5dip, 5dip, mWidth - 10dip, mHeight - 10dip)
	
	SetBitmap(File.DirAssets, "icons8-photo-94.png")
	
	lblText.Initialize("")
	lblText.Text = "Colors"
	mBase.AddView(lblText, 0, mHeight + 3dip, mWidth, 20dip)
	lblText.TextSize = 11
	lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	
	mBase.Height = mHeight + 25dip
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub SetBitmap(Dir As String, fileName As String)
	Dim ico As B4XBitmap = LoadBitmapResize(Dir, fileName, 40dip, 40dip, False)
	Dim bm As BitmapCreator
	bm.Initialize( mWidth - 10dip, mHeight - 10dip)
	bm.DrawBitmap(ico, bm.TargetRect, False)
	imvIcon.SetBackgroundImage(bm.Bitmap)
End Sub

Public Sub setBackgroundColor(color As Int)
	pnlBgButton.As(B4XView).SetColorAndBorder(color, 0dip, Colors.DarkGray, mRadius)
End Sub

Public Sub setText(value As String)
	lblText.Text = value
End Sub

Public Sub setTextSize(value As Int)
	lblText.TextSize = value
End Sub

Public Sub setTextColor(value As Int)
	lblText.TextColor = value
End Sub

Sub pnlBgButton_Click
	CallSub(mCallBack, mEventName & "_Click")
End Sub