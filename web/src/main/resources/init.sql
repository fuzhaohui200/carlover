create table t_user (
  userId varchar(36) not null primary key,
  username varchar(64) not null,
  password varchar(64) not null,
  avater varchar(256),
  phone varchar(11) not null,
  email varchar(64) not null unique,
  qq number(10),
  weixin varchar(64),
  weibo varchar(128),
  createTime date,
  updateTime date
);

create table t_user_info (
  userId varchar(36) not null primary key,
  realName varchar(128),
  signature varchar(4000),
  birthday varchar(32),
  sex int,
  nickName varchar(64),
  enName varchar(64),
  idCard varchar(18),
  level int,
  totalPraise int,
  totalMount double,
  totalScore int
);

create table t_store (
  storeId varchar(36) not null primary key,
  userId varchar(36) not null,
  parentStoreId varchar(36),
  storeName varchar(128),
  address varchar(256),
  phone varchar(16) not null,
  phone2 varchar(16),
  contact varchar(128),
  storeCert varchar(256),
  alipay varchar(128),
  tenpay varchar(128),
  isOfflineStore int,
  country varchar(32),
  province varchar(64),
  city varchar(64),
  district varchar(64),
  detailAddress varchar(256),
  isTraffic int
);

create table t_address (
  addressId varchar(36) not null primary key,
  userId varchar(36) not null,
  province varchar(64),
  city varchar(64),
  district varchar(64),
  detailAddress varchar(256),
  postCode varchar(6),
  defaultFlag int
);

create table t_article (
  articleId varchar(64) not null primary key,
  userId varchar(36) not null,
  title varchar(128) not null,
  content text,
  mark varchar(64),
  createTime date,
  updateTime date
);

create table t_article_comment (
  articleId varchar(36) not null,
  userId varchar(36) not null,
  comment varchar(256) not null,
  star int,
  praise int,
  createTime date,
  updateTime date, -- 取消点赞时间
  primary key(articleId,userId)
);

create table t_brand (
  brandId varchar(36) not null primary key,
  brandName varchar(64) not null,
  productName varchar(128),
  productCountry varchar(64),
  seriesName varchar(128),
  seriesNum varchar(64),
  brandNum varchar(64),
  marketTime Date
);

create table t_car (
  carId varchar(36) not null primary key,
  brandId varchar(36) not null,
  userId  varchar(36) not null,
  buyTime Date,
  carNum varchar(64)
);

create table t_car_record (
  carId varchar(36) not null,
  serviceId varchar(36) not null,
  content varchar(4000),
  createTime date,
  primary key (carId, serviceId)
);

create table t_order (
  orderId varchar(36) not null primary key,
  shopCartId varchar(36) not null,
  userId varchar(36) not null,
  remark varchar(256),
  receiver varchar(64) not null,
  country varchar(64),
  province varchar(64) not null,
  city varchar(64) not null,
  district varchar(64) not null,
  detailAddress varchar(256) not null,
  postCode varchar(6),
  createTime date
);

create table t_product (
  productId varchar(36) not null primary key,
  productCategoryId varchar(36) not null,
  storeId varchar(36) not null,
  productName varchar(128) not null,
  productDesc varchar(512) not null,
  productPrice decimal(7, 2) not null,
  discount decimal(5, 3),
  discountPrice decimal(7, 2),
  isAdded int,
  createTime date,
  updateTime date
);

create table t_product_category (
  productCategoryId varchar(36) not null primary key,
  parentProductCategoryId varchar(36),
  productCategoryName varchar(32),
  productCategoryDesc varchar(4000),
  createTime date,
  updateTime date
);

create table t_service (
  serviceId varchar(36) not null primary key,
  serviceCategoryId varchar(36) not null,
  serviceName varchar(32) not null,
  serviceDesc text,
  createTime date,
  updateTime date
);

create table t_service_category (
  serviceCategoryId varchar(36) not null primary key,
  parentServiceCategoryId varchar(36),
  serviceCategoryName varchar(64) not null,
  serviceCategoryDesc text,
  createTime date,
  updateTime date
);

create table t_shopcart (
  shopcartId varchar(36) not null primary key,
  productId varchar(36) not null,
  productName varchar(64) not null,
  productDesc text,
  productPrice double not null,
  realProductPrice double not null,
  createTime date
);

create table t_store_comment (
  storeId varchar(36) not null,
  userId varchar(36) not null,
  comment varchar(256) not null,
  star int comment '',
  praise int comment '',
  createTime date,
  updateTime date,
  primary key(storeId, userId)
);

alter table t_store
  add COLUMN isTraffic int;