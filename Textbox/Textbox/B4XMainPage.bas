B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=%PROJECT_NAME%.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private ImageView1 As ImageView
	Dim bc As BitmapCreator
	Dim lblStatus As Label
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	'// Vẽ vòng tròn nền
	'canvas.drawArc(rectF, 0, 360, False, backgroundPaint);

	'// Vẽ progress (bắt đầu từ -90 độ để bắt đầu từ phía trên)
	Dim progress As Int = 80
	Dim sweepAngle As Float = 360 * progress / 100
	'canvas.drawArc(rectF, -90, sweepAngle, False, progressPaint);
	
'	Dim cv As Canvas
	'cv.Initialize(ImageView1)
	'Dim Rect1 As Rect
	'Rect1.Initialize(10dip, 10dip, 100dip, 100dip)
	'cv.DrawOval(Rect1, Colors.Gray, False, 5dip)
	

	bc.Initialize(ImageView1.Width, ImageView1.Height)
	
	DrawProgress(45)
	
		
	'ImageView1.SetBackgroundImage(cv.Bitmap)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Sub DrawProgress(Percent As Float)

	bc.FillRect(Colors.White, bc.TargetRect)
	
	

	Dim centerX As Int = bc.mWidth / 2
	Dim centerY As Int = bc.mHeight / 2
	Dim radius As Int =  bc.mWidth / 2

	' Vẽ nền
	bc.DrawCircle(centerX, centerY, radius, Colors.ARGB(255,214,214,214), False, 20)
	bc.DrawCircle(centerX, centerY, radius, Colors.ARGB(255,238,238,238), False, 18)

	Dim sweepAngle As Float = 360 * Percent / 100
	' Vẽ progress
	
	bc.DrawArc(centerX, centerY, radius, Colors.ARGB(255,245,72,74), False, 18, 50, sweepAngle)

	ImageView1.Bitmap = bc.Bitmap
End Sub