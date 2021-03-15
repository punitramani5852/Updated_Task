WinWaitActive("Mozilla Firefox","","10")
if WinExists("Mozilla Firefox") Then
	Send("run-on{TAB}")
	Send("audiometer{Enter}")
	EndIf