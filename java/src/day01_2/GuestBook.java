package day01_2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuestBook {
	private Long gusetNum;
	private String contents;
	private String writer;
	private LocalDate writeDate;
	private Long viewNum;
}
