package br.com.collab

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">


<TextView
android:id="@+id/km"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginBottom="5dp"
android:text="@string/km"
android:textColor="@color/darkblue"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="@+id/valorkm"
app:layout_constraintEnd_toStartOf="@+id/percorridos2"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toEndOf="@+id/valorkm" />

<TextView
android:id="@+id/valorkm"
android:layout_width="43dp"
android:layout_height="39dp"
android:layout_marginTop="24dp"
android:text="@string/valorkmpercorridos"
android:textColor="@color/darkblue"
android:textSize="34sp"
android:textStyle="bold"
app:layout_constraintEnd_toStartOf="@+id/km"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toEndOf="@+id/percorridos2"
app:layout_constraintTop_toBottomOf="@+id/imageView8" />

<TextView
android:id="@+id/percorridos2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="@string/percorridos"
android:textAlignment="center"
android:textColor="@color/darkblue"
app:layout_constraintEnd_toStartOf="@+id/valormoedas"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/km" />

<TextView
android:id="@+id/nomeapp"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="92dp"
android:layout_marginTop="15dp"
android:text="@string/app_name"
android:textColor="@color/purple"
android:textSize="20sp"
android:textStyle="bold"
app:layout_constraintStart_toEndOf="@+id/btn_home"
app:layout_constraintTop_toTopOf="parent" />

<TextView
android:id="@+id/nomeprimeirocolocado"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="11dp"
android:text="@string/nomeprimeirocolocado"
app:layout_constraintStart_toEndOf="@+id/textView"
app:layout_constraintTop_toTopOf="@+id/textView" />

<TextView
android:id="@+id/nomesegundocolocado"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="11dp"
android:text="@string/nomesegundocolocado"
app:layout_constraintStart_toEndOf="@+id/textView2"
app:layout_constraintTop_toTopOf="@+id/textView2" />

<TextView
android:id="@+id/nometerceirocolocado"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="11dp"
android:text="@string/nometerceirocolocado"
app:layout_constraintStart_toEndOf="@+id/textView3"
app:layout_constraintTop_toTopOf="@+id/textView3" />

<TextView
android:id="@+id/ranking"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="15dp"
android:text="@string/ranking"
android:textColor="@color/darkblue"
android:textStyle="bold"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/imageView9" />

<TextView
android:id="@+id/valormoedas"
android:layout_width="83dp"
android:layout_height="39dp"
android:layout_marginTop="24dp"
android:text="@string/valormoedas"
android:textAlignment="center"
android:textColor="@color/purple"
android:textSize="34sp"
android:textStyle="bold"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toEndOf="@+id/percorridos2"
app:layout_constraintTop_toBottomOf="@+id/imageView8" />

<TextView
android:id="@+id/moedas"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="@string/moedas"
android:textColor="@color/purple"
app:layout_constraintEnd_toStartOf="@+id/valormoedas"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toEndOf="@+id/valormoedas"
app:layout_constraintTop_toBottomOf="@+id/valormoedas" />

<ImageView
android:id="@+id/imageView8"
android:layout_width="100dp"
android:layout_height="100dp"
android:layout_marginTop="26dp"
android:contentDescription="@string/app_name"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/nomeapp"
app:srcCompat="@drawable/logo" />

<Button
android:id="@+id/btnminhaconta"
android:layout_width="50dp"
android:layout_height="50dp"
android:layout_marginTop="16dp"
android:layout_marginEnd="16dp"
android:background="@color/transparent"
android:drawableTop="@drawable/avatar_small"
android:drawablePadding="4dp"
android:paddingTop="0dp"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_toTopOf="parent" />

<ImageView
android:id="@+id/imageView9"
android:layout_width="330dp"
android:layout_height="153dp"
android:layout_marginTop="11dp"
android:contentDescription="@string/banner1"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/moedas"
app:srcCompat="@drawable/banner1" />

<ImageView
android:id="@+id/btn_home"
android:layout_width="25dp"
android:layout_height="25dp"
android:layout_marginStart="16dp"
android:contentDescription="@string/menu"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="@+id/nomeapp"
app:srcCompat="@drawable/menu" />

<TextView
android:id="@+id/textView2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="16dp"
android:text="@string/segundolugar"
android:textColor="@color/purple"
android:textStyle="bold"
app:layout_constraintStart_toStartOf="@+id/textView"
app:layout_constraintTop_toBottomOf="@+id/textView" />

<TextView
android:id="@+id/textView"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="115dp"
android:layout_marginTop="52dp"
android:text="@string/primeirolugar"
android:textColor="@color/purple"
android:textStyle="bold"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/imageView9" />

<TextView
android:id="@+id/textView3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="16dp"
android:text="@string/terceirolugar"
android:textColor="@color/purple"
android:textStyle="bold"
app:layout_constraintStart_toStartOf="@+id/textView"
app:layout_constraintTop_toBottomOf="@+id/textView2" />

<com.google.android.material.bottomappbar.BottomAppBar
android:id="@+id/bottomAppBar"
android:layout_width="409dp"
android:layout_height="wrap_content"
android:layout_gravity="bottom"
app:backgroundTint="@color/gray"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent" />

<ImageView
android:id="@+id/buttonconsquistas"
android:layout_width="30dp"
android:layout_height="30dp"
android:layout_marginTop="13dp"
android:contentDescription="@string/conquistas"
app:layout_constraintEnd_toEndOf="@+id/textconquistas"
app:layout_constraintStart_toStartOf="@+id/textconquistas"
app:layout_constraintTop_toTopOf="@+id/bottomAppBar"
app:srcCompat="@drawable/conquistas" />

<TextView
android:id="@+id/textconquistas"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="2dp"
android:layout_marginEnd="24dp"
android:text="@string/conquistas"
android:textAlignment="center"
android:textColor="@color/purple"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_toBottomOf="@+id/buttonconsquistas" />

<TextView
android:id="@+id/texttroquesuasmoedas"
android:layout_width="102dp"
android:layout_height="37dp"
android:layout_marginTop="2dp"
android:layout_marginEnd="10dp"
android:text="@string/troquesuasmoedas"
android:textAlignment="center"
android:textColor="@color/purple"
app:layout_constraintEnd_toStartOf="@+id/textconquistas"
app:layout_constraintTop_toBottomOf="@+id/buttontroquesuasmoedas" />

<ImageView
android:id="@+id/buttontroquesuasmoedas"
android:layout_width="30dp"
android:layout_height="30dp"
android:layout_marginTop="13dp"
android:contentDescription="@string/troquesuasmoedas"
app:layout_constraintEnd_toEndOf="@+id/texttroquesuasmoedas"
app:layout_constraintHorizontal_bias="0.492"
app:layout_constraintStart_toStartOf="@+id/texttroquesuasmoedas"
app:layout_constraintTop_toTopOf="@+id/bottomAppBar"
app:srcCompat="@drawable/troqueseuspontos" />

<TextView
android:id="@+id/textcampanha"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="20dp"
android:layout_marginTop="2dp"
android:text="@string/campanhas"
android:textAlignment="center"
android:textColor="@color/purple"
app:layout_constraintStart_toEndOf="@+id/textcaminhada"
app:layout_constraintTop_toBottomOf="@+id/buttoncampanha" />

<ImageView
android:id="@+id/buttoncampanha"
android:layout_width="30dp"
android:layout_height="30dp"
android:layout_marginTop="13dp"
android:contentDescription="@string/campanhas"
app:layout_constraintEnd_toEndOf="@+id/textcampanha"
app:layout_constraintStart_toStartOf="@+id/textcampanha"
app:layout_constraintTop_toTopOf="@+id/bottomAppBar"
app:srcCompat="@drawable/campanhas" />

<TextView
android:id="@+id/textcaminhada"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="24dp"
android:layout_marginTop="2dp"
android:text="@string/Caminhada"
android:textAlignment="center"
android:textColor="@color/purple"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/buttoncaminhada" />

<ImageView
android:id="@+id/buttoncaminhada"
android:layout_width="30dp"
android:layout_height="30dp"
android:layout_marginTop="13dp"
android:contentDescription="@string/Caminhada"
app:layout_constraintEnd_toEndOf="@+id/textcaminhada"
app:layout_constraintStart_toStartOf="@+id/textcaminhada"
app:layout_constraintTop_toTopOf="@+id/bottomAppBar"
app:srcCompat="@drawable/caminhada" />

<androidx.constraintlayout.widget.Group
android:id="@+id/group"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
app:constraint_referenced_ids="km,valorkm" />



</androidx.constraintlayout.widget.ConstraintLayout>