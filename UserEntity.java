package schoo.entity;

import lombok.Data;

/**
 * ユーザ用Entity
 */
@Data
public class UserEntity {
	private Integer userId;
	private String userName;
	private Integer age;
}