DELIMITER $$  -- 默认的结束标志为分号，这个是转换为 $$
-- 存储过程只能进行简单的逻辑，不要过度依赖存储过程
-- 创建的存储过程是用来取自增的客户id
CREATE PROCEDURE update_client_id
  (
    table_name VARCHAR(50),
    OUT id BIGINT
  )

BEGIN
  -- 开始存储过程
#   SET id = SELECT max() FROM table_name
  DECLARE newId BIGINT DEFAULT 1;
#   UPDATE table_name

END $$