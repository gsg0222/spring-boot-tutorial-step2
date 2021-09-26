package blog.tsuchiya.tutorial.step2.controller.form;

import lombok.Data;

/**
 * formタグの入力に対応するDTO
 */
@Data
public class TestForm {

	private String text;
	
	private String textarea;
	
	private Integer select;
	
	private String radio;
	
	private String checkBox;
	
}
