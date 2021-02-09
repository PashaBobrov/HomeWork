package homeWork5;

/**
 * ����� ��������� ��������� ����� ���� �� �������� storageNames. ��������� ��������� {@link IRandom}
 * ��������� ����������  {@link Rand}
 * @autor ����� ������
 * @version 1.1
 */
public class RandStringNames extends Rand implements IRandom {
    /**  ������ ����� - ��������� ����*/
    static protected String[] storageNames = {"�������", "������", "�����",
            "������", "������", "�������", "����������", "���",
            "������", "�����", "��������", "�������",
            "��������", "������", "��������", "�����", "��������", "���������",
            "�����", "�������", "ϸ��", "������", "�����", "������"};

    /**
     * ���������� ��������� ��� �� ������� {@link RandStringNames#storageNames}
     * @param min ����������� ���������� ����������
     * @param max ������������ ���������� ��������
     * @return ��������� ���
     */
    @Override
    public String randString(int min, int max) {
        String result;
        int countSymbols = randInt(min, max);
        do {
            result = storageNames[randInt(0, storageNames.length-1)];
        } while (result.length() != countSymbols);
        return result;
    }
}
