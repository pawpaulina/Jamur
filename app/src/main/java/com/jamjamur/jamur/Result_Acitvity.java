package com.jamjamur.jamur;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Result_Acitvity extends AppCompatActivity {

    private Jamur jamur=new Jamur();
    private ArrayList<Jamur>LisJamurList=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung1=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung2=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung3=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung4=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung5=new ArrayList<>();
    private ArrayList<Jamur>LisPenampung6=new ArrayList<>();

    private ImageView imagejamur;
    private TextView namajamur;
    private TextView deskripsijamur;
    private TextView bentukjamur;
    private TextView warnajamur;
    private TextView baujamur;
    private TextView cincinjamur;
    private TextView lendirjamur;
    private TextView habitatjamur;
    private Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result__acitvity);
        initJamur();
        imagejamur=(ImageView)findViewById(R.id.imagejamur);
        namajamur=(TextView) findViewById(R.id.namajamur);
        deskripsijamur=(TextView) findViewById(R.id.deskripsijamur);
        bentukjamur=(TextView) findViewById(R.id.bentukjamur);
        baujamur=(TextView) findViewById(R.id.baujamur);
        cincinjamur=(TextView) findViewById(R.id.cincinjamur);
        lendirjamur=(TextView) findViewById(R.id.lendirjamur);
        habitatjamur=(TextView) findViewById(R.id.habitatjamur);
        warnajamur = (TextView)findViewById(R.id.warnajamur);
        btnkembali = (Button)findViewById(R.id.btnKembali);

        Intent intent=getIntent();
        Bundle extras = intent.getExtras();
        String bentuk= extras.getString("bentuk");
        String warna= extras.getString("warna");
        String bau= extras.getString("bau");
        String cincin= extras.getString("cincin");
        String lendir= extras.getString("lendir");
        String habitat= extras.getString("habitat");


        jamur.setBentuk(bentuk);
        jamur.setWarna(warna);
        jamur.setBau(bau);
        jamur.setCincin(cincin);
        jamur.setLendir(lendir);
        jamur.setHabitat(habitat);

        InfrenceEngine();

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),IdentifikasiActivity1.class);
                startActivity(i);
            }
        });
    }

    private void initJamur()
    {
        Jamur j;

        j = new Jamur(1,"Jamur Tiram Putih (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","Jamur tiram (Pleurotus ostreatus) atau jamur tiram putih adalah jamur pangan dengan tudung berbentuk setengah lingkaran mirip cangkang tiram dengan bagian tengah agak cekung dan berwarna putih hingga krem. Jamur tiram masih satu kerabat dengan Pleurotus eryngii atau King Oyster Mushroom.\n" +
                "Tubuh buah memiliki tangkai yang tumbuh menyamping (bahasa Latin: pleurotus) dan bentuknya seperti tiram (ostreatus), sehingga jamur tiram mempunyai nama binomial Pleurotus ostreatus. Bagian tudung berubah warna dari hitam, abu-abu, coklat, hingga putih, dengan permukaan yang hampir licin, diameter 5-20 cm. Tepi tudung mulus sedikit berlekuk. Spora berbentuk batang berukuran 8-11×3-4cm. Miselia berwarna putih dan bisa tumbuh dengan cepat.\n" +
                "Di alam bebas, jamur tiram bisa dijumpai hampir sepanjang tahun di hutan pegunungan daerah yang sejuk. Tubuh buah terlihat saling bertumpuk di permukaan batang pohon yang sudah melapuk atau pokok batang pohon yang sudah ditebang.\n" +
                "Budidaya jamur ini tergolong sederhana. Jamur tiram biasanya dipeliharan dengan media tanam serbuk gergaji steril yang dikemas dalam kantung plastik.\n" +
                "Selain campuran pada berbagai jenis masakan, jamur tiram merupakan bahan baku obat statin. Jamur tiram diketahui membunuh dan mencerna nematoda yang kemungkinan besar dilakukan untuk memperoleh nitrogen.","jamur_tiram_putih",0,"putih","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(2,"Jamur Tiram Merah (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","Jamur tiram (Pleurotus ostreatus) atau jamur tiram putih adalah jamur pangan dengan tudung berbentuk setengah lingkaran mirip cangkang tiram dengan bagian tengah agak cekung dan berwarna putih hingga krem. Jamur tiram masih satu kerabat dengan Pleurotus eryngii atau King Oyster Mushroom.\n" +
                "Tubuh buah memiliki tangkai yang tumbuh menyamping (bahasa Latin: pleurotus) dan bentuknya seperti tiram (ostreatus), sehingga jamur tiram mempunyai nama binomial Pleurotus ostreatus. Bagian tudung berubah warna dari hitam, abu-abu, coklat, hingga putih, dengan permukaan yang hampir licin, diameter 5-20 cm. Tepi tudung mulus sedikit berlekuk. Spora berbentuk batang berukuran 8-11×3-4cm. Miselia berwarna putih dan bisa tumbuh dengan cepat.\n" +
                "Di alam bebas, jamur tiram bisa dijumpai hampir sepanjang tahun di hutan pegunungan daerah yang sejuk. Tubuh buah terlihat saling bertumpuk di permukaan batang pohon yang sudah melapuk atau pokok batang pohon yang sudah ditebang.\n" +
                "Budidaya jamur ini tergolong sederhana. Jamur tiram biasanya dipeliharan dengan media tanam serbuk gergaji steril yang dikemas dalam kantung plastik.\n" +
                "Selain campuran pada berbagai jenis masakan, jamur tiram merupakan bahan baku obat statin. Jamur tiram diketahui membunuh dan mencerna nematoda yang kemungkinan besar dilakukan untuk memperoleh nitrogen.","jamur_tiram_pink",0,"merah semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(3,"Jamur Tiram Kuning (Pleoratus ostreatus)","Tidak berbau","Tidak ada","Tidak","kayu mati","Jamur tiram (Pleurotus ostreatus) atau jamur tiram putih adalah jamur pangan dengan tudung berbentuk setengah lingkaran mirip cangkang tiram dengan bagian tengah agak cekung dan berwarna putih hingga krem. Jamur tiram masih satu kerabat dengan Pleurotus eryngii atau King Oyster Mushroom.\n" +
                "Tubuh buah memiliki tangkai yang tumbuh menyamping (bahasa Latin: pleurotus) dan bentuknya seperti tiram (ostreatus), sehingga jamur tiram mempunyai nama binomial Pleurotus ostreatus. Bagian tudung berubah warna dari hitam, abu-abu, coklat, hingga putih, dengan permukaan yang hampir licin, diameter 5-20 cm. Tepi tudung mulus sedikit berlekuk. Spora berbentuk batang berukuran 8-11×3-4cm. Miselia berwarna putih dan bisa tumbuh dengan cepat.\n" +
                "Di alam bebas, jamur tiram bisa dijumpai hampir sepanjang tahun di hutan pegunungan daerah yang sejuk. Tubuh buah terlihat saling bertumpuk di permukaan batang pohon yang sudah melapuk atau pokok batang pohon yang sudah ditebang.\n" +
                "Budidaya jamur ini tergolong sederhana. Jamur tiram biasanya dipeliharan dengan media tanam serbuk gergaji steril yang dikemas dalam kantung plastik.\n" +
                "Selain campuran pada berbagai jenis masakan, jamur tiram merupakan bahan baku obat statin. Jamur tiram diketahui membunuh dan mencerna nematoda yang kemungkinan besar dilakukan untuk memperoleh nitrogen.","jamur_tiram_kuning",0,"kuning semu","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(4,"Jamur Merang Putih (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","Jamur merang (Volvariella volvacea) merupakan jamur yang paling dikenal, terutama untuk masyarakat Asia Tenggara, dan telah lama dibudidayakan sebagai bahan pangan, karena termasuk golongan jamur yang enak rasanya. Jamur merang umumnya tumbuh pada media yang merupakan sumber selulosa, misalnya, pada tumpukan merang, dekat limbah penggilingan padi, limbah pabrik kertas, ampas batang aren, limbah kelapa sawit, ampas sagu, sisa kapas, kulit buah pala, dan sebagainya.\n" +
                "Jamur merang kaya akan protein kasar dan karbohidrat bebas N (N-face carbohydrate). Tingkat kandungan serat kasar dan abu adalah moderat, sedangkan kandungan lemaknya rendah. Nilai energi jamur merang rendah, namun merupakan sumber protein dan mineral yang baik dengan kandungan kalium dan fosfor yang tinggi. Kandungan Na, Ca, Mg dan Cu, Zn , Fe cukup. Kandungan logam berat Pb dan Cd tidak ada, sehingga jamur merang sangat baik digunakan sebagai bahan makanan sehari-hari. Kandungan protein jamur merang mencapai 1, 8 persen, lemak 0.3 persen, dam karbohidrat 12 – 48 persen.\n" +
                "Jamur merang kaya akan protein, sebagai makanan anti kolesterol, eritadenin dalam jamur merang dikenal sebagai penawar racun, dan banyak mengandung antibiotik yang berguna untuk pencegahan anemia. Menurut penelitian jamur juga dapat digunakan untuk mengobati kanker.","jamur_merang_putih",0,"putih","bulat");
        LisJamurList.add(j);
        j = new Jamur(5,"Jamur Merang Coklat (volvoriella volvaceae)","Tidak berbau","Tidak ada","Tidak","jerami","Jamur merang (Volvariella volvacea) merupakan jamur yang paling dikenal, terutama untuk masyarakat Asia Tenggara, dan telah lama dibudidayakan sebagai bahan pangan, karena termasuk golongan jamur yang enak rasanya. Jamur merang umumnya tumbuh pada media yang merupakan sumber selulosa, misalnya, pada tumpukan merang, dekat limbah penggilingan padi, limbah pabrik kertas, ampas batang aren, limbah kelapa sawit, ampas sagu, sisa kapas, kulit buah pala, dan sebagainya.\n" +
                "Jamur merang kaya akan protein kasar dan karbohidrat bebas N (N-face carbohydrate). Tingkat kandungan serat kasar dan abu adalah moderat, sedangkan kandungan lemaknya rendah. Nilai energi jamur merang rendah, namun merupakan sumber protein dan mineral yang baik dengan kandungan kalium dan fosfor yang tinggi. Kandungan Na, Ca, Mg dan Cu, Zn , Fe cukup. Kandungan logam berat Pb dan Cd tidak ada, sehingga jamur merang sangat baik digunakan sebagai bahan makanan sehari-hari. Kandungan protein jamur merang mencapai 1, 8 persen, lemak 0.3 persen, dam karbohidrat 12 – 48 persen.\n" +
                "Jamur merang kaya akan protein, sebagai makanan anti kolesterol, eritadenin dalam jamur merang dikenal sebagai penawar racun, dan banyak mengandung antibiotik yang berguna untuk pencegahan anemia. Menurut penelitian jamur juga dapat digunakan untukmengobati kanker.","jamur_merang_coklat",0,"coklat","bulat");
        LisJamurList.add(j);
        j = new Jamur(6,"Jamur Shiitake (Lentinula edodes)","Tidak berbau","Tidak ada","Tidak","kayu mati","Shiitake dengan nama ilmiah Lentinula edodes adalah jamur yang dapat dikonsumsi yang mulanya berasal dari Asia Timur (Jepang). Disebut jamur shitake jamur karena jamur ini tumbuh di batang pohon yang sudah lapuk.\n" +
                "Jamur shitake banyak dibudiayakan di Thailand, Sebagian wilayah Korea dan Jepang dan juga di alam bebas daerah pegunungan Asia Tenggara termasuk Indonesia. Penyebutan jamur shitake di Tionghoa itu berbeda-beda, ada menyebutnya jamur harum, jamur musim dingin, jamur bunga. Perbedaan nama ini didasarkan pada motif retak-retak seperti mekar.\n" +
                "Di Indonesia kadang-kadang dinamakan jamur jengkol, karena bentuk dan aromanya seperti jengkol walaupun bagi sebagian orang rasa jamur ini seperti rasa petai.\n" +
                "Jamur shitake memiliki ciri-ciri yaitu tumbuh di permukaan batang kayu yang lapuk, bentuk batang melengkung, payung terbuka lebar, warna coklat tua dengan bulu-bulu tua dengan bulu-bulu halus di bagian atas permukaan payung sedangkan dibagian bawah payung berwarna putih.","jamur_shitake",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(7,"Jamur Kuping coklat(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","Jamur kuping (Auricularia auricula) merupakan salah satu kelompok jelly fungi yang masuk ke dalam kelas Basidiomycota dan mempunyai tekstur jelly yang unik (Volk, 2009). Fungi yang masuk ke dalam kelas ini umumnya makroskopis atau mudah dilihat dengan mata telanjang. Miseliumnya bersekat dan dapat dibedakan menjadi dua macam yaitu: miselium primer (miselium yang sel-selnya berinti satu, umumnya berasal dari perkembangan basidiospora) dan miselium sekunder (miselium yang sel penyusunnya berinti dua, miselium ini merupakan hasil konjugasi dua miselium primer atau persatuan dua basidiospora). Jamur ini disebut jamur kuping karena bentuk tubuh buahnya melebar seperti daun telinga manusia (kuping).\n"+
                "Jamur kuping sering digunakan sebagai campuran sup ini memiliki rasa yang cukup lezat. Tak heran menjadi jenis makanan yang digemari semua usia. Terlepas dari itu, jamur kuping sudah dikenal secara luas sebagai bahan makanan yang memiliki khasiat sebagai obat dan penawar racun. Manfaat jamur kuping ini telah diketahui sejak ratusan tahun lalu oleh bangsa Tionghoa. Lendir yang dihasilkan jamur kuping selama dimasak dapat menjadi pengental. Lendir jamur kuping dapat menonaktifkan atau menetralkan kolesterol.","jamur_kuping_coklat",0,"coklat","cuping");
        LisJamurList.add(j);
        j = new Jamur(8,"Jamur Kuping hitam(Auricularia auricula)","Tidak berbau","Tidak ada","Ya","kayu mati","Jamur kuping (Auricularia auricula) merupakan salah satu kelompok jelly fungi yang masuk ke dalam kelas Basidiomycota dan mempunyai tekstur jelly yang unik (Volk, 2009). Fungi yang masuk ke dalam kelas ini umumnya makroskopis atau mudah dilihat dengan mata telanjang. Miseliumnya bersekat dan dapat dibedakan menjadi dua macam yaitu: miselium primer (miselium yang sel-selnya berinti satu, umumnya berasal dari perkembangan basidiospora) dan miselium sekunder (miselium yang sel penyusunnya berinti dua, miselium ini merupakan hasil konjugasi dua miselium primer atau persatuan dua basidiospora). Jamur ini disebut jamur kuping karena bentuk tubuh buahnya melebar seperti daun telinga manusia (kuping).\n"+
                "Jamur kuping sering digunakan sebagai campuran sup ini memiliki rasa yang cukup lezat. Tak heran menjadi jenis makanan yang digemari semua usia. Terlepas dari itu, jamur kuping sudah dikenal secara luas sebagai bahan makanan yang memiliki khasiat sebagai obat dan penawar racun. Manfaat jamur kuping ini telah diketahui sejak ratusan tahun lalu oleh bangsa Tionghoa. Lendir yang dihasilkan jamur kuping selama dimasak dapat menjadi pengental. Lendir jamur kuping dapat menonaktifkan atau menetralkan kolesterol.","jamur_kuping_hitam",0,"hitam","cuping");
        LisJamurList.add(j);
        j = new Jamur(9,"Jamur Maitake (Grifola frondosa)","Tidak berbau","Tidak ada","Tidak","kayu mati","Jamur Maitake dianggap sebagai jamur obat dan diklasifikasikan sebagai adaptogen. Adaptogen membantu tubuh melawan segala bentuk stres, baik mental atau fisik dan memiliki fungsi normalisasi pada tubuh.\n" +
                "Jamur maitake dianggap sebagai jamur yang paling kuat sejauh memperkuat sistem kekebalan tubuh atau sistem imun. Para glukan dan polisakarida di dalamnya merangsang sistem kekebalan tubuh dengan meningkatkan aktivitas sel T-helper.\n" +
                "Jamur juga telah digunakan untuk mengurangi rasa sakit, mual, rambut rontok dan efek samping lainnya negatif dari kemoterapi. Ini sarat dengan antioksidan yang sangat kuat yang disebut ergothioneine yang dapat membantu melindungi sel-sel dan mengurangi risiko tertular penyakit kronis.\n" +
                "Maitake juga memiliki sifat antivirus yang sangat kuat dan telah terbukti dapat membunuh virus HIV dalam percobaan laboratorium. Ini juga telah digunakan untuk mengobati hepatitis dan sindrom kelelahan kronis. Ini juga mungkin memiliki nilai dalam mengobati tekanan darah tinggi dan meningkatkan kadar insulin.\n" +
                "Banyak penelitian sedang dilakukan untuk menentukan apakah ini jamur obat mungkin merupakan pengobatan yang efektif untuk kanker. Studi awal menunjukkan ia memiliki nilai dalam penghambatan tumor.\n" +
                "Selain itu kemampuan untuk merangsang sistem kekebalan tubuh, maitake sering digunakan untuk mengobati kondisi seperti, kolesterol tinggi, gula darah tinggi dan kolesterol tinggi.","jamur_maitake",0,"hitam","cuping");
        LisJamurList.add(j);
        j = new Jamur(10,"Jamur Bulan (Gymnopus sp)","Tidak berbau","Tidak ada","Tidak","tanah","Jamur bulan disebut juga jamur supa barat atau suung bulan (Gymnopus sp) adalah jamur dengan Cap (payung) berwarna putih, permukaannya licin dan agak lengket, berukuran 5 – 10 cm dengan bagian bawah berbilah lunak dan convexnya beralur di tepi. Pada saat masih kecil bentuknya seperti kancing dengan tangkai yang pendek berukuran ± 1 cm. Volva tidak jelas menempel ditanah sementara tangkai melekat dibagian sentral.\n" +
                "Ditemukan di hutan sekunder kawasan TNKS daerah Sungai Susup Desa Napalicin Kecamatan Rawas Hulu Sumatera Selatan. Jamur ini cukup digemari masyarakat. Saat dewasa, jamur ini dapat dimakan, rasanya lezat dan lembut namun kurang begitu dimanfaatkan penduduk setempat.\n"+
                "Jamur ini merupakan jamur liar dan belum dibudidayakan (belum ditemukan cara budidaya yang tepat untuk jamur ini). Saat ini, jamur bulan sudah sulit dicari. Tumbuh dan hidup pada musim hujan terutama saat angin berhembus dari barat. Banyak ditemukan pada tegalan, kebun atau di pinggir rumah, terutama di atas sarang rayap atau pada tanah yang kandungan organiknya sangat baik. Jamur ini berkembang biak secara berkelompok di permukaan tanah yang lembab dan di akar tanaman.\n" +
                "Jamur ini memiliki tudung berwarna putih kekuning-kuningan atau kecoklat-coklatan dengan batang putih bersih. Jamur ini termasuk jenis tumbuhan yang tidak berbahaya atau beracun.","jamur_bulan",0,"kuning semu","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(11,"Jamur Bulat (Lycoperdun perlatum)","Tidak berbau","Tidak ada","Tidak","padang rumput","des","jamur_bulat",0,"putih","bulat");
        LisJamurList.add(j);
        j = new Jamur(12,"Jamur barat (Clitocybe nebularis)","Bau","Tidak ada","Tidak","tanah","Jamur barat bukanlah jamur tiram. Jamur barat ini sering ditemukan di bawah semak atau bekas kayu mati. Bentuknya seperti payung dan warnanya putih. Masa hidupnya tidak lama, mungkin hanya setengah hari.\n" +
                "Hanya orang yang tinggal di pedesaan dengan tumbuhan yang masih lebat yang bisa menikmati keberadaan jamur barat di musim penghujan. Jamur barat alami ini mempunyai rasa yang lebih nikmat dibandingkan dengan jamur barat yang dibudidayakan dan jamur tiram. Akan tetapi, mengingat keberadaan pepohonan yang kian berkurang karena adanya pembangunan, sepertinya tidak ada pilihan lain selain membudidayakannya.","jamur_barat",0,"coklat semu","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(13,"Jamur Ling Zhi (Ganoderma lucidum)","Tidak berbau","Tidak ada","Tidak","kayu mati","Menurut buku Pengobatan Herbal Tiongkok, ling zhi tercantum sebagai bahan obat nomor satu dari 365 bahan obat lainnya. Karena itu, ling zhi dijuluki sebagai jamur seribu khasiat, jamur ajaib, jamur abadi, dan raja herbal yang ajaib. \n" +
                "\n" +
                "Tidak hanya di negara asalnya, Cina; di negara Barat pun telah lama dikenal penggunaan jamur untuk makanan kesehatan, seperti ditulis Bapak Kedokteran Barat Hipocrates sekitar 445 M. Jamur ling zhi merupakan salah satu jenis jamur kayu dan telah dikenal sejak zaman Kaisar Shi Huang Ti (259-210 SM). \n" +
                "Wajarlah, mengingat jamur memang merupakan obat tradisional yang paling sering digunakan oleh masyarakat cina. Oleh sebab itu, Cina dikenal sebagai pelopor penggunaan jamur ling zhi untuk ramuan pengobatan tradisional mereka.\n" +
                "Karena sifatnya yang alot dan pahit, maka jamur biasanya diolah menjadi sejenis cairan untuk diminum (elixir). Jamur yang berwarna merah hitam ini sejak dulu dipercaya sebagai pohon kehidupan untuk mempertahankan dan memperpanjang umur.\n" +
                "Secara kasat mata, tubuh jamur lingzhi memiliki bentuk seperti payung atau buah ginjal. Sebagian orang melukiskannya sebagai ekor burung merak. Jamur ini berbentuk bundar, bagian tepi berlekuk, sedikit bergerigi, dan dagingnya tebal. Bagian atas tubuh jamur berwarna merah tua. Khusus untuk spesies lucidum, warna jamurnya cerah mengilap dan ada guratan-guratan di sekujur tubuh jamur.\n" +
                "\n" +
                "Tubuh jamur lingzhi atau Ganoderma lucidum mengandung lebih dari 200 senyawa aktif yang\n" +
                "dapat dibagi menjadi tiga kelompok utama, hakni 30 % senyawa larut dalam air, 65 % senyawa\n" +
                "larut dalam pelarut organik, dan 5 % senyawa volatil. Polisakarida dan germanium organik\n" +
                "merupakan senyawa larut dalam air. Adenosin dan pertenoid adalah senyawa yang larut dalam\n" +
                "pelarut organik, sedangkan asam ganoderat termasuk senyawa volatil. ","jamur_lingzhi",0,"coklat","tudung serong");
        LisJamurList.add(j);
        j = new Jamur(14,"Jamur chanterelle (Cantharellus cibarius)","Bau","Tidak ada","Tidak","tanah","Chantarelle atau Chanterelle emas (Cantharellus cibarius) adalah fungi dengan genus Cantharellus. Berwarna jingga atau kuning, kenyal dan berbentuk mirip corong. Di bawah \"topi\", tekstur jamur terlihat bergelombang. Jamur ini berbau seperti buah aprikot dan terasa sedikit pedas, jamur ini sangat baik untuk dimakan. Riset mengatakan jamur ini memiliki sifat insektisida yang tidak mematikan bagi manusia namun dapat melindungi jamur dari serangga dan bakteri.","jamur_chanterelle",0,"kuning","corong");
        LisJamurList.add(j);
        j = new Jamur(15,"Jamur landak (Hydnum repandum)","Bau","Tidak ada","Tidak","hutan pohon kayu","des","jamur_landak",0,"oranye semu","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(16,"Jamur surai singa (Hericium erinaceus)","Tidak berbau","Tidak ada","Tidak","kayu mati","Jamur ini, dikenal secara ilmiah sebagai Hericium erinaceus, penelitian baru dalam the International Journal of Medicinal Mushrooms menunjukkan bahwa jamur surai singa mendukung regenerasi sel-sel saraf yang terluka, sesuatu yang bahkan baru-baru ini diyakini sebagai hal yang tidak mungkin dalam medis. Penelitian lebih lanjut menetapkan bahwa ekstrak cair dari jamur ini juga membantu menumbuhkan sel-sel otak dan saraf baru, yang dikenal sebagai neuron.\n" +
                "Penelitian ini hanyalah langkah awal untuk mengetahui khasiat jamur surai singa bagi penyembuhan otak. Setidaknya selusin penelitian lain menunjukkan sifat penyembuhan dari jamur ini terhadap otak.\n" +
                "Dalam satu studi hewan dengan plak amiloid yang sebanding dengan yang ditemukan pada penyakit Alzheimer, diberi makan diet normal dengan jamur surai singa. Ternyata hewan tersebut menunjukan kembalinya kapasitas kognitif dan jauh lebih mampu menavigasi labirin, mereka juga memiliki penurunan beta amiloid plak-biomarker yang menunjukkan pembalikan penyakit Alzheimer.\n","jamur_surai_singa",0,"kuning semu","rumbai");
        LisJamurList.add(j);
        j = new Jamur(17,"Jamur matsutake (Tricholoma matsutake)","Bau","Ada","Tidak","dasar pohon","Jamur Matsutake diberi julukan sebagai King of Edible mushroom dikarenakan cita rasanya yang nikmat dan juga karena jenis ini merupakan jamur langka yang belum berhasil dibudidayakan. Dinamakan Matsutake dari bahasa Jepang, yakni Matsu = Pinus, dan take = mushroom/jamur. Jamur pinus merupakan nama umum untuk jamur mikorhiza dari genus Tricholoma familia Tricholomataceae. Jamur ini tumbuh liar di Cina, Jepang, Korea, Finlandia, dan tempat lain didunia dengan iklim sejuk.\n"+
                "Sesuai dengan namanya, pencarian jamur dilakukan di hutan pinus pada wilayah yang sejuk. Jamur ini dipanen pada musim gugur dan merupakan jamur berharga sangat mahal di Jepang. Matsutake tumbuh dipermukaan tanah hutan pinus yang ditumbuhi jenis pinus merah jepang, Tsuga diversifolia, pohon runjung Tsuga dan Pinus pumila. Pertumbuhan miselium diketahui sangat lambat. Miselium merupakan bagian tubuh jamur yang melekat pada akar pohon. Pohon dan tubuh jamur tersebut akan membentuk suatu simbiosis yang saling menguntungkan. Miselium akan membantu pohon dalam pengangkutan air dan nutrien, sedangkan pohon akan memberikan kebutuhan zat organik bagi pertumbuhan miselium. Suhu untuk pertumbuhan miselium adalah sekitar 5-30 °C dengan suhu ideal sekitar 22-25°C dan pH tanah ideal 4,5-5,5.\n"+
                "Banyak orang Jepang yang bersemangat menyambut musim gugur, terlebih di daerak Kansai dan sekitarnya dimana jamur ini banyak tumbuh. Masyarakat sering berkumpul bersama untuk menikmati matsutake. Mereka membawa nasi, sake dan peralatan memasak ke dalam hutan pinus merah yang biasanya dilestarikan sebagai tempat pertumbuhan matsutake. Mereka memetik matsutake, memasaknya dan berpiknik seharian. Matsutake dapat dinikmati dengan beragam cara, namun cara terbaik untuk menikmati aroma dan rasanya adalah dengan cara mengirisnya panjang-panjang kemudian membakarnya sebentar lalu dinikmati dengan sedikit garam dan kecap.  Matsutake juga dapat ditanak bersama beras menjadi nasi matsutake (matsutake gohan) dan sebagai campuran dobinmushi (sup dalam teko). Sayangnya, harga matsutake sangat mahal, berkisar $100 per pound/per setengan kilogram (jika 1 dollar = Rp 10.000 maka harga Matsutake Rp. 1 juta/pound!). Salah satu alasan mahalnya jamur ini adalah panen matsutake yang semakin terbatas karena adanya serangga yang merusak pohon pinus merah tempat jamur tumbuh.\n"+
                "Jamur Matsutake akan bermunculan di akhir musim panas dan musim gugur (September-Oktober) dalam iklim dingin dan (melalui Januari) dalam iklim yang cenderung hangat. Sebagaimana dengan jamur lainnya, konvensi penamaan Latin jamur pinus tidak selalu seragam. Spesies Asia dan Eropa Utara menyebutnya sebagai Tricholoma matsutake, sementara di Amerika Utara jamur ini sering disebut Tricholoma magnivelare. Saat ini belumlah jelas apakah keduanya benar-benar spesies yang sama.","jamur_matsutake",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(18,"Jamur Amanita (Amanita muscaria)","Tidak berbau","Ada","Tidak","dasar pohon","Jamur Amanita merupakan jamur yang dapat meyebabkan psikotik dan cukup beracun.  Jamur ini memiliki ciri-ciri insang putih besar dan bintik-bintik putih. tanaman ini terdapat di berbagai belahan dunia seperti Asia, Eropa, dan Amerika bgian utara. beberapa ahli menganggap jika jamur ini dapat memabukkan, namun ini belum bisa dibuktikan secara langsung.\n" +
                "Dengan menggunakan Amanita Muscaria dikatakan tanggal kembali ke lebih dari 10,1000 tahun. Spiritualis menggunakan fly agaric sebagai obat mengubah pikiran untuk melakukan kontak dengan para dewa. Ini juga telah menyarankan bahwa penggunaan Amanita muscaria bertanggung jawab atas penemuan Bapa Natal Clause. Sejarah dukun yang memasuki properti melalui lubang dan daun di luar sana dengan cara yang sama bisa menjadi cerita yang diceritakan dalam Siberia. Hari ini Bapa Natal mengenakan nuansa yang sama persis seperti agaric terbang. Selesai terlihat memiliki tas penuh hadiah, reindeers nya bisa terbang, dan dia mengunjungi adalah milik masing-masing anak dengan turun cerobong asap atau lebih lagi.\n" +
                "Dalam kata-kata Jerman, nama mengenai jamur itu dianggap sebagai insektisida, bila digunakan dalam kombinasi dengan susu. Dalam 1256 Albertus Magnus disebutkan untuk nya atau komentar nya; “Hal ini disebut jamur dari perjalanan, karena tergencet dalam susu itu menghancurkan lalat. Label berbagai fungi, ‘tanggal kembali ke tahun 1753. Lakukan yang terbaik, Linnaeus dan Lamarck akhirnya bertanggung jawab untuk mengidentifikasi muscaria Amanita jamur. Satu mikologi (satu yang mempelajari jamur) menyatakan yang mengganggu agaric adalah nama awal, serta jamur yang digunakan dalam membersihkan hama di Norwegia, dan di Inggris.\n" +
                "Di Siberia, hewan peliharaan yang dipandang sebagai bawah mempengaruhi tewas serta dimakan pengaruh mereka mabuk. Teori ini juga menunjukkan bahwa Viking yang sengit prajurit yang mengikuti fly agaric akan pergi tanpa rasa takut ke dalam pertempuran. Beberapa legenda cenderung percaya ini menjadi mungkin. Banyak legenda, tradisi dan dongeng umumnya terkait dengan menggunakan fly agaric. Hal ini juga berpikir bahwa rusa bisa terbang karena mereka juga terjadi untuk diberikan beberapa agraris lalat. Sampai saat ini, gambaran muscaria Amanita ditempatkan tentang depan terkait dengan Natal buatan sendiri kartu.","jamur_amanita",0,"merah bintik","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(19,"Jamur Supa Kakabu (Boletus sp)","Tidak berbau","tidak ada","Tidak","dasar pohon","des","jamur_supa_kakabu",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(20,"Jamur Supa Rampak (Coprinus)","Tidak berbau","ada","ya","jerami","des","jamur_supa_rampak",0,"coklat","tudung kerucut");
        LisJamurList.add(j);
        j = new Jamur(21,"Jamur Cortinarius","Tidak berbau","tidak ada","tidak","tanah","des","jamur_cortinarius",0,"biru","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(22,"Jamur Lactarius indigo","Tidak berbau","tidak ada","ya","dasar pohon","des","jamur_laktarius",0,"biru","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(23,"Jamur Lepiot","Tidak berbau","ada","tidak","hutan pohon kayu","des","jamur_lepiot",0,"coklat bintik","tudung oval");
        LisJamurList.add(j);
        j = new Jamur(24,"Jamur Morsel","Tidak berbau","tidak ada","tidak","kayu mati","des","jamur_morsel",0,"coklat","tudung tak berbentuk");
        LisJamurList.add(j);
        j = new Jamur(25,"Jamur Poliot","Tidak berbau","tidak ada","tidak","kayu mati","des","jamur_poliot",0,"kuning","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(26,"Jamur Phallus","bau","ada","ya","hutan pohon kayu","des","jamur_phallus",0,"kuning semu","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(27,"Jamur Russula","tidak berbau","tidak ada","ya","kayu mati","des","jamur_russula",0,"merah","tudung datar");
        LisJamurList.add(j);
        j = new Jamur(28,"Jamur Boletus","tidak berbau","tidak ada","tidak","tanah","des","jamur_boletus",0,"coklat","tudung cembung");
        LisJamurList.add(j);
        j = new Jamur(29,"Jamur Kancing (Agaricus bisporus)","tidak berbau","ada","tidak","jerami","des","jamur_kancing",0,"putih","tudung cembung");
        LisJamurList.add(j);
    }
    private void InfrenceEngine()
    {
        for (int i=0;i<LisJamurList.size();i++)
        {
            if(LisJamurList.get(i).getWarna().toString().equalsIgnoreCase(jamur.getWarna()))
            {
                LisPenampung1.add(LisJamurList.get(i));
            }
        }
        for (int i=0;i<LisPenampung1.size();i++)
        {
            if(jamur.getBentuk().equalsIgnoreCase(LisPenampung1.get(i).getBentuk()))
            {
                LisPenampung2.add(LisPenampung1.get(i));
            }
        }
        for (int i=0;i<LisPenampung2.size();i++)
        {
            if(jamur.getHabitat().equalsIgnoreCase(LisPenampung2.get(i).getHabitat()))
            {
                LisPenampung3.add(LisPenampung2.get(i));
            }
        }
        for (int i=0;i<LisPenampung3.size();i++)
        {
            if(jamur.getBau().equalsIgnoreCase(LisPenampung3.get(i).getBau()))
            {
                LisPenampung4.add(LisPenampung3.get(i));
            }
        }
        for (int i=0;i< LisPenampung4.size();i++)
        {
            if(jamur.getCincin().equalsIgnoreCase(LisPenampung4.get(i).getCincin()))
            {
                LisPenampung5.add(LisPenampung4.get(i));
            }
        }
        for (int i=0;i<LisPenampung5.size();i++)
        {
            if(jamur.getLendir().equalsIgnoreCase(LisPenampung5.get(i).getLendir()))
            {
                LisPenampung6.add(LisPenampung5.get(i));
            }
        }
        if(LisPenampung6.size()==0) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Result_Acitvity.this);
            alertDialogBuilder.setTitle("Kesalahan!");
            alertDialogBuilder.setMessage("Jamur tidak ditemukan");
            alertDialogBuilder.setNeutralButton("Cari Ulang", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), IdentifikasiActivity1.class);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else {
            String uri = "@drawable/"+LisPenampung6.get(0).getImage();  // where myresource (without the extension) is the file
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            imagejamur= (ImageView)findViewById(R.id.imagejamur);
            Drawable res = getResources().getDrawable(imageResource);
            imagejamur.setImageDrawable(res);
            namajamur.setText(LisPenampung6.get(0).getNama());
            deskripsijamur.setText(LisPenampung6.get(0).getDeksripsi());
            bentukjamur.setText("Bentuk : "+LisPenampung6.get(0).getBentuk());
            baujamur.setText("Bau : "+LisPenampung6.get(0).getBau());
            cincinjamur.setText("Cincin : "+LisPenampung6.get(0).getCincin());
            lendirjamur.setText("Lendir : "+LisPenampung6.get(0).getLendir());
            habitatjamur.setText("Habitat : "+LisPenampung6.get(0).getHabitat());
            warnajamur.setText("Warna : "+LisPenampung6.get(0).getWarna());
        }
    }

}
