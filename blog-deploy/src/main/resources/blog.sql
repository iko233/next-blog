create table blog_post
(
    id            bigint primary key auto_increment not null comment 'id',
    user_id       bigint comment '用户id',
    classify_id   bigint comment '分类id',
    classify_name bigint comment '分类名称',
    title         varchar(50) comment '标题',
    content       text comment 'web内容',
    markdown      text comment 'markdown内容',
    create_time   datetime comment '创建时间',
    update_time   datetime comment '更新时间',
    status        int comment '状态'
) comment '博文表';

create table blog_classify
(
    id     bigint primary key auto_increment not null comment 'id',
    name   varchar(20) comment '名称',
    status int comment '状态'
) comment '分类表';

create table blog_tag
(
    id     bigint primary key auto_increment not null comment 'id',
    name   varchar(20) comment '名称',
    status int comment '状态'
) comment '标签表';

create table blog_tag_quote
(
    id       bigint primary key auto_increment not null comment 'id',
    tag_id   bigint comment '标签id',
    tag_name varchar(20) comment '标签名称',
    post_id  long comment '博文id',
    status   int comment '状态'
) comment '标签引用表';

