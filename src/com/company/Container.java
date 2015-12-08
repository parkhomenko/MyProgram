package com.company;

/**
 * Created by Mike on 12/2/2015.
 */
public class Container {
        private int[] list;
        private int size;

        public Container() {
            this.size = 0;
            this.list = new int[10];
        }

        public Container(int initialCapacity) {
            this.size = 0;
            if (initialCapacity >= 0) {
                this.list = new int[initialCapacity];
            } else {
                this.list = new int[10];//TODO warn
            }
        }

        public void add(int value) {
            int[] newList = new int[size + 1];
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            newList[size] = value;
            list = newList;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("error");
            }

            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }

        public boolean contains(int query) {
            for (int i=0; i< size; i++) {
                if (i == query) {
                    return true;
                }
            }
            return false;
        }

        public void addAll(Container input) {
            for (int i = 0; i < input.getSize(); i++) {
                this.add(input.get(i));
            }
        }

        public int get(int i) {
            if (i < size && i >= 0) return list[i];
            else throw new IndexOutOfBoundsException();
        }

        public int getSize() {
            return size;
        }

        public void clear() {
            this.size = 0;//TODO discuss with students
        }

        public boolean equalToOtherList(Container otherList) {
            if (otherList == null) {
                return false;
            }
            if (this.getSize() != otherList.getSize()) {
                return false;
            }
            for (int i = 0; i < getSize(); i++) {
                if (this.get(i) != otherList.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public void sort() {
            list = mergeSort(list);
        }

        private int[] mergeSort(int[] listOne) {
            if (listOne.length <= 1) return listOne;
            else {
                int[] fpart = new int[listOne.length / 2];
                int fpartIt = 0;
                int[] spart = new int[listOne.length / 2 + listOne.length % 2];
                int spartIt = 0;
                for (int i = 0; i < listOne.length; i++) {
                    if (i < listOne.length / 2) {
                        fpart[fpartIt] = listOne[i];
                        fpartIt++;
                    } else {
                        spart[spartIt] = listOne[i];
                        spartIt++;

                    }
                }
                fpart = mergeSort(fpart);
                spart = mergeSort(spart);
                int[] result = merge(fpart, spart);
                return result;

            }
        }
        private int[] merge(int[] listOne, int[] listTwo) {
            int[] rez = new int[listOne.length + listTwo.length];
            int firstIt = 0;
            int secondIt = 0;
            int count = 0;
            while (firstIt < listOne.length || secondIt < listTwo.length) {
                if (firstIt < listOne.length && (secondIt == listTwo.length || listOne[firstIt] < listTwo[secondIt])) {
                    rez[count] = listOne[firstIt];
                    firstIt++;
                } else if (secondIt < listTwo.length && (firstIt == listOne.length || listOne[firstIt] >= listTwo[secondIt])) {
                    rez[count] = listTwo[secondIt];
                    secondIt++;
                }
                count++;
            }
            return rez;
        }

        private void print() {
            System.out.print("List: ");
            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + ", ");
            }
            System.out.println();
        }

    }

