<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/rrr"
    android:focusableInTouchMode="true"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/btnBotao"
        style="@android:style/Widget.Material.Light.Button.Toggle"
        android:layout_width="200dp"
        android:layout_height="40dp"


        android:autoText="false"
        android:background="#FF1414"
        android:bufferType="normal"
        android:capitalize="sentences"
        android:cursorVisible="false"
        android:drawableTop="@color/colorAccent"
        android:filterTouchesWhenObscured="false"
        android:fitsSystemWindows="false"
        android:focusableInTouchMode="false"
        android:freezesText="false"
        android:hapticFeedbackEnabled="false"
        android:scrollbarDefaultDelayBeforeFade="100"
        android:scrollbarFadeDuration="100"
        android:scrollbarSize="4dp"
        android:text="Botão"
        android:textAllCaps="true"
        android:textColor="@android:color/background_dark"
        android:textSize="18sp"
        android:textStyle="bold"
        android:typeface="monospace"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.80" />


    <EditText
        android:id="@+id/editText"
        android:layout_width="255dp"
        android:layout_height="0dp"
        android:layout_marginTop="344dp"
        android:ems="10"
        android:inputType="textEmailAddress"
        android:text="Email:"
        android:textColor="@android:color/background_light"
        app:layout_constraintBottom_toTopOf="@+id/editText3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editText3"
        android:layout_width="255dp"
        android:layout_height="0dp"
        android:layout_marginBottom="300dp"
        android:ems="10"
        android:inputType="textEmailAddress"
        android:text="Senha:"
        android:textAllCaps="true"
        android:textColor="@android:color/background_light"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="79dp"
        android:layout_height="19dp"
        android:layout_marginBottom="16dp"
        android:text="Cadastre-se"
        android:textColor="@android:color/holo_red_light"
        app:layout_constraintBottom_toTopOf="@+id/btnBotao"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText3" />

    <ImageView
        android:id="@+id/imageView11"
        android:layout_width="27dp"
        android:layout_height="23dp"
        android:layout_marginBottom="16dp"
        android:src="@android:drawable/ic_dialog_email"
        app:layout_constraintBottom_toTopOf="@+id/imageView12"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.122"
        app:layout_constraintStart_toStartOf="parent" />

    <ImageView
        android:id="@+id/imageView12"
        android:layout_width="27dp"
        android:layout_height="23dp"
        android:src="@android:drawable/ic_dialog_email"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.121"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="395dp" />

</androidx.constraintlayout.widget.ConstraintLayout>