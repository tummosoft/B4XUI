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
	Private pnlButton As B4XView
	Private CheckBoxState As Boolean = False ' False: chưa chọn, True: đã chọn
	Private bc As BitmapCreator
	Private imgCheckBox As ImageView
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
	pnlButton = xui.CreatePanel("pnlButton_Click")
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	imgCheckBox.Initialize("")
	Root.AddView(imgCheckBox, 50dip, 150dip, 220dip, 60dip)
    
	Dim TargetSize As Int = 50dip
	bc.Initialize(TargetSize / xui.Scale, TargetSize / xui.Scale)
    
	' Vẽ checkbox lần đầu tiên với trạng thái mặc định (False)
	DrawCheckBox
    
	' Gán bitmap từ bc vào ImageView
	' SetBitmapToImageView là cách tối ưu để hiển thị BitmapCreator, nó tự động căn chỉnh [citation:1].
	bc.SetBitmapToImageView(bc.Bitmap, imgCheckBox)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Sub CreateRadiusButton(Target As B4XView, Radius As Int, BtnColor As Int, Text As String)
    
	Dim bc As BitmapCreator
	bc.Initialize(Target.Width, Target.Height)
    
	'Vẽ hình chữ nhật bo góc
	bc.DrawRectRounded(bc.TargetRect, BtnColor, True, 0, Radius)
    
	'Tạo bitmap từ BitmapCreator
	Dim bmp As B4XBitmap = bc.Bitmap
    
	'Gán background cho panel
	Target.SetBitmap(bmp)
    
	'Thêm label chữ
	Dim lbl As Label
	lbl.Initialize("")
	lbl.Text = Text
	lbl.TextColor = Colors.White
	lbl.TextSize = 18
	lbl.Gravity = Gravity.CENTER
	Target.AddView(lbl, 0, 0, Target.Width, Target.Height)
    
End Sub

Private Sub DrawCheckBox
	' Xóa toàn bộ bản vẽ trước đó bằng màu trong suốt [citation:1]
	bc.DrawRect(bc.TargetRect, xui.Color_Transparent, True, 0)
    
	' --- Vẽ khung của checkbox ---
	' Màu viền xám đậm, độ dày viền 2 pixel (đã scale)
	Dim BorderColor As Int = xui.Color_Black
	Dim BorderWidth As Int = 2
	' Vẽ một hình chữ nhật không tô màu (Filled = False) để làm khung [citation:1]
	bc.DrawRect(bc.TargetRect, BorderColor, False, BorderWidth)
    
	' --- Nếu checkbox đang được chọn, vẽ thêm dấu tick ---
	If CheckBoxState Then
		' Dấu tick thường là một đường chéo. Chúng ta có thể vẽ nó bằng cách vẽ hai đường xiên.
		' Tọa độ được tính tương đối trong bc.TargetRect (từ (0,0) đến (Width, Height))
		Dim Left As Float = 0
		Dim Top As Float = 0
		Dim Right As Float = bc.TargetRect.Width
		Dim Bottom As Float = bc.TargetRect.Height
        
		' Tạo một brush màu xanh lá để vẽ tick [citation:1]
		Dim TickBrush As BCBrush = bc.CreateBrushFromColor(xui.Color_Green)
        
		' Vẽ đường chéo thứ nhất (từ góc trên-trái xuống dưới-phải)
		bc.DrawLine2(Left + (Right - Left) * 0.2, Top + (Bottom - Top) * 0.4, _
                     Left + (Right - Left) * 0.45, Top + (Bottom - Top) * 0.7, _
                     TickBrush, 3)
        
		' Vẽ đường chéo thứ hai (từ điểm cuối của đường thứ nhất đến góc dưới-phải)
		bc.DrawLine2(Left + (Right - Left) * 0.45, Top + (Bottom - Top) * 0.7, _
                     Left + (Right - Left) * 0.8, Top + (Bottom - Top) * 0.3, _
                     TickBrush, 3)
	End If
End Sub

Sub pnlButton_Click
	ToastMessageShow("Button clicked!", False)
End Sub