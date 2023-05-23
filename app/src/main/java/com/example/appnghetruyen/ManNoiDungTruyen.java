TextView txtTenTruyen,txtNoidung,ten;
TextToSpeech : t1 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_noi_dung_truyen);

        txtNoidung = findViewById(R.id.NoiDung);
        txtTenTruyen = findViewById(R.id.TenTruyen);
        ten = findViewById(R.id.N);

        Intent intent = getIntent();
       String tenTruyen = intent.getStringExtra("tentruyen");
       String noidung = intent.getStringExtra("noidung");

       txtTenTruyen.setText(tenTruyen);
       txtNoidung.setText(noidung);

       //Cuộn textview
        txtNoidung.setMovementMethod(new ScrollingMovementMethod());
         t1 = new TextToSpeech(this,new TextToSpeech.OnInitListener(){
                @Override
                public void onInit(int i) {
                    if (i != TextToSpeech.ERROR)
                        t1.setLanguage(Locale.ENGLISH)
                }
        });
        ten.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View view){
       t1.speak(ttxtNoidung,TextToSpeech.QUEUE_FLUSH,null)
}
        });
               
    }
}
