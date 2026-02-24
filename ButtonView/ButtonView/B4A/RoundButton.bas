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
	Private imvIcon As Label
	Private lblText As Label
	Private pnlWrapper As Panel
	Private baseColor As Int = Colors.ARGB(255,40, 69, 214)
	Private baseBackground As Int = Colors.White
	Private iconColor As Int = Colors.White
	Private mDisabled As Boolean = False
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (base As Object, lbl As Label, Props As Map)
	mBase = base
    Tag = mBase.Tag
    mBase.Tag = Me 
	baseBackground = xui.PaintOrColorToColor(Props.Get("TextColor"))
	
	mBase.Color = Colors.Transparent
	pnlWrapper.Initialize("pnlWrapper")
	mBase.AddView(pnlWrapper, 2dip, 2dip, mBase.Width - 4dip, mBase.Height - 4dip)
	
	imvIcon.Initialize("")
	pnlWrapper.AddView(imvIcon, 2dip, 0, 20dip, pnlWrapper.Height)
	imvIcon.TextSize = 22
	imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	imvIcon.TextColor = iconColor
	imvIcon.Visible = True
	
	lblText.Initialize("")
	pnlWrapper.AddView(lblText, 0dip, 0dip, pnlWrapper.Width, pnlWrapper.Height)
	lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	
	pnlWrapper.As(B4XView).SetColorAndBorder(baseBackground, 1dip, baseColor, 4dip)
	
	lblText.TextSize = 14
	lblText.Text = "Round Button"
	
	lblText.TextColor = baseColor
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub setDisabled(value As Boolean)
	mDisabled = value
	If mDisabled = True Then		
		pnlWrapper.As(B4XView).SetColorAndBorder(Colors.ARGB(255, 204, 204, 204), 1dip, Colors.ARGB(255, 204, 204, 204), 4dip)
	Else
		pnlWrapper.As(B4XView).SetColorAndBorder(baseBackground, 1dip, baseColor, 4dip)
	End If
	
End Sub

Public Sub getDisabled() As Boolean
	Return mDisabled
End Sub

Sub RedrawColor()
	pnlWrapper.As(B4XView).SetColorAndBorder(baseBackground, 0dip, baseColor, 4dip)
	lblText.TextColor = baseColor
End Sub

Public Sub SetColor(value As Int)
	baseBackground = value
	RedrawColor
End Sub

Public Sub SetTextColor(value As Int)
	baseColor = value
	RedrawColor
End Sub

Public Sub SetIconColor(value As Int)
	imvIcon.TextColor = value
End Sub

Public Sub SetFont(value As Typeface)
	imvIcon.Typeface = value
End Sub

Public Sub setTextSize(value As Int)
	lblText.TextSize = value
End Sub



Public Sub SetIcon(value As String)
	If value = "" Then
		imvIcon.Visible = False
		imvIcon.Text = value		
		lblText.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
		lblText.Width = pnlWrapper.Width
		lblText.Left = 0
	Else
		imvIcon.Visible = True		
		imvIcon.TextColor = baseColor
		imvIcon.Text = value
		lblText.Gravity = Gravity.LEFT + Gravity.CENTER
		lblText.Left = 25dip
	End If	
End Sub

Sub pnlWrapper_Click()

	If mDisabled = False Then
		mBase.SetColorAndBorder(baseBackground, 2dip, Colors.ARGB(150,7, 220, 242), 4dip)
		Sleep(300)
		mBase.SetColorAndBorder(Colors.Transparent, 0dip, Colors.ARGB(150,7, 220, 242), 4dip)
		CallSub(mCallBack, mEventName & "_Click")
	End If
	
End Sub