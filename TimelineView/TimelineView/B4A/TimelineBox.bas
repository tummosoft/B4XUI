B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As Panel
	Private xui As XUI 'ignore
	Public Tag As Object
	Private pnlWrapper As Panel
	Private imvLine As ImageView
	Private imvTop As ImageView
	Private pnlContent As Panel
	Private lineWidth As Int = 2dip
	Private lblTitle As Label
	Private lblContent As Label
	Private lblTime As Label
	Private pnlButtonGroup As Panel
	Private cv As Canvas
End Sub

Public Sub Initialize (Callback As Object, EventName As String, width As Int, height As Int)
	mEventName = EventName
	mCallBack = Callback
	mBase.Initialize("mBase")
	pnlWrapper.Initialize("")
	
	imvLine.Initialize("")
	imvTop.Initialize("")
	
	mBase.AddView(imvTop, 0dip,0dip,20dip,20dip)
	mBase.AddView(imvLine, 10dip, 20dip,lineWidth,height)
	imvTop.Color = Colors.Magenta
	imvLine.Color = Colors.Red
	
	cv.Initialize(imvLine)
	
	'pnlWrapper.Color = Colors.Gray
	Dim bRunning As B4XBitmap=LoadBitmapResize(File.DirAssets,"running.png", 15dip, 15dip, True)
	imvTop.Bitmap = bRunning

	drawDottedLine(0, 0, 0, imvLine.Height, Colors.LightGray, 5dip)

	pnlContent.Initialize("")
	mBase.AddView(pnlContent, 20dip, 20dip, width - 30dip,height - 30dip)
	pnlContent.Color = Colors.Gray
	
	'pnlContent.As(B4XView).SetColorAndBorder(Colors.ARGB(255,235, 244, 246), 0dip, Colors.White, 8dip)

	pnlContent.LoadLayout("timeline_item")
		
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
    Tag = mBase.Tag
    mBase.Tag = Me 
  	Dim clr As Int = xui.PaintOrColorToColor(Props.Get("TextColor")) 'Example of getting a color value from Props
End Sub

Public Sub setColor(value As Int)
	'pnlContent.Color = value
	pnlContent.As(B4XView).SetColorAndBorder(value, 0dip, Colors.White, 8dip)
End Sub

Public Sub setTitle(value As String)
	lblTitle.Text = value
End Sub

Public Sub setDescription(value As String)
	lblContent.Text = value
End Sub

Public Sub setTime(value As String)
	lblTime.Text = value
End Sub

Public Sub setLineColor(color As Int)
	imvLine.Color = color
End Sub

Public Sub setLineWidth(value As Int)
	lineWidth = value
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub GetView() As Panel
	Return mBase
End Sub

Public Sub LoadLayout(LayoutFile As String)
	'pnlContent.LoadLayout(LayoutFile)	
End Sub

Public Sub setBitmap(value As Bitmap)
	imvTop.Bitmap = value
End Sub

Public Sub HideButton()
	pnlButtonGroup.Visible = False
End Sub

Private Sub drawDottedLine(x1 As Float, y1 As Float, x2 As Float, y2 As Float, foreColor As Int, segmentSize As Int)
	Dim lineLength As Float = Sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
	Dim nSegments As Int = (lineLength + .5 * segmentSize) / (1.5 * segmentSize)
	Dim fract As Float = (lineLength + .5 * segmentSize) / lineLength

	Dim xIncr As Float = fract * (x2 - x1) / nSegments
	Dim xIncrLine As Float = .6667 * xIncr
	Dim yIncr As Float = fract * (y2 - y1) / nSegments
	Dim yIncrLine As Float =  .6667 * yIncr
    
	For i = 0 To nSegments - 1
		Dim xx1 As Float = x1 + i * xIncr
		Dim yy1 As Float = y1 + i * yIncr
		Dim xx2 As Float = xx1 + xIncrLine
		Dim yy2 As Float = yy1 + yIncrLine
		If i = nSegments - 1 Then
			cv.DrawLine(xx1, yy1, x2, y2, foreColor, lineWidth)
		Else
			cv.DrawLine(xx1, yy1, xx2, yy2, foreColor, lineWidth)
		End If
	Next
End Sub