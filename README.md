# CICD
![CI:CD 구성](https://github.com/Secrethan/CICD/assets/107679440/228874da-604c-46bb-872d-ea8af05b264f)
나중에 정리할 내용
1. RDS는 서브넷 배치할 때  가용영역을 최소 2개 이상 요구한다. RDS, EC2를 생성하기 전 서브넷팅할 때 반드시 가용영역을 나누자
2. RDS, EC2는 Private Subent에 배치하는 것이 보안적인 측면에서 좋다. 로컬에서 SSH를 사용해 원격으로 접속하고자 할 때는 NAT GateWay 설정을 통해 Private subnet에 접근할 수 있다.
3. AWS에는 글로벌 자원(IAM,S3,Route 53 etc.)과 지역 자원(EC2, RDS, CodePipeline)으로 나뉜다. 서로 다른 리전에 있는 지역 자원 끼리도 접근은 가능하지만(VPC Peering, public access) 지연, 보안 이슈가 있다. 
4. EC2와 RDS의 VPC를 분리하지 않았으나 보통 중요도가 있는 시스템의 경우 개발/테스트/운영을 각 다른 VPC로 구성하는게 일반적이라고 한다.(논리적인 망 분리로 보안 사고 방지)
   
