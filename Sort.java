

    public class Sort{
        public static void inserSort(long[] array){
            //数组一共有array.length个
            //故，子操作需执行array.length或array.length-1次
            for(int i = 0;i < array.length-1;i++){
                //有序区间【0，i+1)
                //因i已经等于0，所以i已有序,故为i+1
                //无序区间【i+1,array.length】
                //所以抓取出来的数是i+1
                long key = array[i+1];
                int j;
                //按倒序的顺序依次在有序区间进行比较[i,0]
                for(j = 1;j >= 0;j--){//j就是要与key进行比较，有三种情况：
                    //1.key<array[j] 把array[j]往后移，继续向前比较,key=array[j]
                    //2.key==array[j] 不移把key放入array[j]后，array[j+1]=key,不需要继续比较
                    //3.key>array[j] 把key放入array[j]后，array[j+1]=key,不需要继续比较
                    if(key < array[j]){
                        array[j+1] = array[j];
                    }else{
                        break;
                    }
                    array[j+1] = key;
                }
            }
        }
        //测试
//构建随机生成的乱序数
        public static long[] BuildRandomArray(){
            Random random = new Random(20201018);
            long[] array = new long[10];
            for(int i = 0;i < 20; i++){
                array[i] = random.nextInt(100);
            }
            return array;
        }
    }

        //构建完全有序数组
        public static long[] BuildOrderedArray(){
            long[] array = BuildRandomArray();
            Array.sort(array);
            return array;
        }

        //构建完全逆序数组
        public static long[] BuildReverseArray(){
            long[] array = BuildOrderedArray();
            swap(array,0,9);
            swap(array,1,8);
            swap(array,2,7);
            swap(array,3,6);
            swap(array,4,5);
            return array;
        }

        //构建完全相等的数组
        public static long[] BuildEqualArray(){
            long[] array = new long[10];
            for(int i = 0;i < 10;i++){
                array[i] = 9;
            }
            return array;
        }

        //swap
        public static void swap(long[] array,int i,int j){
            long t = array[i];
            array[i] = array[j];
            array[j] = t;
        }

        //主调用函数
        public static void main(String[] args){
            long[] a1 = BuildRandomArray();
            System.out.println(Arrays.toString(a1));
            inserSort(a1);
            System.out.println(Arrays.toString(a1));
        }


    }
