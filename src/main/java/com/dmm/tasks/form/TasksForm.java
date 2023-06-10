package com.dmm.tasks.form;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//import com.sample.Annotation.DayCheck;

import lombok.Data;

@Data
public class TasksForm {
	// titleへのバリデーション設定を追加
	@Size(min = 1, max = 200)
	private String title;
	// textへのバリデーション設定を追加
	@Size(min = 1, max = 200)
	private String text;

	  @DateTimeFormat(pattern = "yyyy-MM-dd")
	  private LocalDate date;
}
