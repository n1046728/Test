�Ĥ@�D�G
�Q�Ϋغc�l(constructor)���[���è̤U�����Ѥ��{���[�c���g JAVA �{���A�� main()��
���\��i�H���Q����A�����g�{���ɥ��ݲŦX�U�C 6 ���W�d�G�i25 ���j
1.main()�������e�Ҥ��i��ʩμW�[�C
2.class Base ���� private int a;�P private int m=2;�A��ݫŧi�� private �ݩʤ��i���A���������ۦP�C
3.class Derive �����~�����O class Base�C
4.�Q�� Derive x=new Derive (4,5); �إ� x ����A�æP�ɱN 4 �P 5 ���O�]�w�� class Base���� a �P class Derive ���� b�C
5.public void show()����N a�Bm �P b �ۭ��ᤧ���G�q�ù��C�L�X�C
6.�]�ۦ�]�p�������^�A�i�ۥѼ��g�һݨD�������A�ϱo��ӵ{���බ�Q������C���Ѥ��{���[�c�p�U�G
class Base {
private int a;
private int m=2;
�]�ۦ�]�p�������^
}
class Derive �~�� Base {
int b;
�]�ۦ�]�p�������^
public void show() {
 �]�ۦ�]�p���϶��^
}
}
public class P1 {
public static void main(String[] args) {
 Derive x=new Derive (4,5);
 x.show();
}
}
