package com.pinthai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class TroubleshootingActivity extends AppCompatActivity {
    TextView data1,data1h,data2,data2h,data3,data3h,data4,data5,data4h,data6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troubleshooting);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        data1 = (TextView) findViewById(R.id.tbs_text_01);
        data1h = (TextView) findViewById(R.id.tbs_text_01h);
        data2 = (TextView) findViewById(R.id.tbs_text_02);
        data2h = (TextView) findViewById(R.id.tbs_text_02h);
        data3 = (TextView) findViewById(R.id.tbs_text_03);
        data3h = (TextView) findViewById(R.id.tbs_text_03h);
        data4 = (TextView) findViewById(R.id.tbs_text_04);
        data5 = (TextView) findViewById(R.id.tbs_text_05);
        data4h = (TextView) findViewById(R.id.tbs_text_04h);
        data6 = (TextView) findViewById(R.id.tbs_text_06);

        data1h.setText("รถดับเพราะน้ำมันหมด");
        data1.setText("1.พยายามนำรถเข้าจอดข้างทางที่ปลอดภัย \n" +
                "2.เปิดไฟฉุกเฉิน \n" +
                "3.โทรหา call center ของยี่ห้อรถที่ใช้ หรือเบอร์ฉุกเฉินทางหลวง 1193 \n" +
                "*ต้องใช้น้ำมันที่จะมาเติมอย่างน้อย 5 ลิตร\n" +
                "หลังการเติมน้ำมันแล้ว\n" +
                "1.รถยนต์ที่ใช้ระบบสตาร์ทแบบบิดกุญแจ \n");
        data2.setText("2.รถยนต์ที่ใช้ระบบ push start \n" +
                "ให้กดมาที่ระบบ ACC ก่อน จนไฟโชว์ที่หน้าจอดับหมดให้กดอีกครั้งเพื่อสตาร์ท แต่ในบางรุ่นจะมีการสำรองน้ำมันไว้ในระบบสามารถกดสตาร์ทได้เลย เมื่อมาตรวัดโชว์ว่ามีน้ำมันอยู่ในถังเชื้อเพลิงแล้ว\n" +
                "3.เครื่องยนต์ดีเซล \n" +
                "ให้เปิดฝากระโปงรถขึ้น หาตัวกรองน้ำมันเชื้อเพลิง หน้าตาคล้าย ๆ กระปุกขนาดเท่ากระบอกน้ำมีจุกสีดำ ตรงจุกสีดำข้างบนกระปุกนั้นเรียกว่าปั๊มแรงดันต่ำ (ปั๊มมือ) ให้ใช้มือกดปั๊มมือหลายๆครั้งจนรู้สึกมีแรงต้านมือจึงหยุด แล้วลองไปสตาร์ทเครื่อง หากยังไม่ติดลองทำการกดปั๊มใหม่อีกครั้ง แล้วสตาร์ทเครื่องอีกรอบ\n");
        data2h.setText("รถยนต์ติดแก๊สไม่มีน้ำมันสตาร์เครื่องทำอย่างไร");
        data3.setText("ส่วนใหญ่รถยนต์ที่ติดตั้งระบบแก๊สมาจากโรงงานผู้ผลิตรถยนต์ สามารถเปลี่ยนมาใช้ระบบแก๊สในการสตาร์ทเครื่องยนต์ได้ ด้วยการกดปุ่มเลือกระบบเชื้อเพลิงค้างไว้จนไฟโชว์มาที่ระบบแก๊สแล้วลองสตาร์ทเครื่องยนต์ ส่วนรถยนต์ที่ไปติดตั้งตามร้านรับติดตั้งให้สอบถามข้อมูลว่าสามารถทำแบบดังกล่าวได้หรือไม่ ถ้าไม่สามารถทำได้ ให้ใช้ตามขั้นตอนในหัวข้อ”รถดับเพราะน้ำมันหมด”");
        data3h.setText("แบตเตอรี่หมดสตาร์ทไม่ติด");
        data4.setText("ให้ปิดสวิตช์กุญแจและอุปกรณ์ไฟฟ้าทั้งหมดของรถและขอความช่วยเหลือจากรถยนต์ที่มีแบตเตอรี่");
        data5.setText("จากนั้นสตาร์ทเครื่องยนต์คันที่แบตเตอรี่มีไฟ ทิ้งไว้ประมาณ 3 นาที แล้วเร่งเครื่องยนต์เล็กน้อยเพื่อให้แบตเตอรี่มีการไหลเวียนของประจุไฟฟ้า หลังจากนั้น เริ่มสตาร์ทเครื่องยนต์คันที่แบตเตอรี่หมด จากนั้นเร่งเครื่องยนต์ประมาณ 1,500 – 2,000 รอบ/นาที เพื่อเช็คดูว่าประจุไฟเข้าหลังจากการชาร์จหรือไม่ ซึ่งถ้าเครื่องยนต์ไม่ดับแสดงว่าการชาร์จไฟเข้าแบตเตอรี่สำเร็จ และควรสตาร์ทเครื่องยนต์ทิ้งไว้ประมาณ 30 นาที หรือขับรถไปเข้าศูนย์บริการเพื่อตรวจเช็คเครื่องยนต์และเปลี่ยนแบตเตอรี่ใหม่\n");
        data4h.setText("เครื่องยนต์ความร้อนขึ้น");
        data6.setText("อย่า!! เปิดฝาหม้อน้ำ ควรรอให้เครื่องยนต์เย็นก่อน ประมาณ 15 นาที\n" +
                "การเปิดฝาหม้อน้ำควรใช้ผ้าหนา ๆ หรือใช้ผ้ายางปูพื้นในห้องโดยสารมารองมือ เพื่อป้องกันความร้อน และค่อย ๆ หมุนเพื่อระบายความดันออก เมื่อดูว่าน้ำในหม้อน้ำมีระดับต่ำ ก็ให้เติมน้ำเพิ่มเข้าไป หลังจากเครื่องยนต์ดับไปแล้วสักครึ่งชั่วโมง เพื่อให้เครื่องยนต์คลายความร้อนก่อน ไม่ควรรีบเติมน้ำลงไปทันที เพราะโลหะที่ร้อนจัดเมื่อถูกน้ำเย็น จะหดตัวลงอย่างรวดเร็วจนเกิดการแตกร้าวได้ ควรเติมน้ำครั้งละประมาณครึ่งลิตร และเว้นช่วงประมาณ 3-5 นาที เพื่อให้น้ำที่เติมลงไป ค่อย ๆ ดึงความร้อนเข้ามา เพื่อป้องกันปะเก็นฝาสูบแตกหรือฝาสูบโก่ง\n" +
                "เมื่อเติมน้ำเต็มแล้ว ควรติดเครื่องยนต์ไว้ด้วย เพื่อให้น้ำมีการหมุนเวียนและหมั่นตรวจสอบมาตรวัดอุณหภูมิ และให้ตรวจสอบรอยรั่วซึมของน้ำตามจุดต่าง ๆ ถ้าไม่มีและอุณหภูมิลดลงอยู่ในระดับปกติก็เดินทางต่อได้ และอย่าควรติดเครื่องยนต์ให้ความร้อนอยู่ในระดับปกติ สังเกตพัดลมระบายความร้อนว่าทำงานหรือไม่ ถ้าบกพร่องควรแก้ไขก่อน แต่ถ้าจำเป็นต้องขับรถจริง ๆ เพื่อหาที่ซ่อม หรือจุดพักที่ปลอดภัยกว่า ให้ดูที่มาตรวัดความร้อนถ้าเข็มขึ้นสูงกว่าปกติให้จอดพักรถเปิดฝากระโปรง ประมาณ 20-30 นาที ในรถรุ่นใหม่ๆ ที่ไม่มีมาตรวัดความร้อนเตือน เมื่อไฟโชว์ความร้อนขึ้นให้จอดทันที เปิดฝากระโปรงพักรถเช่นเดียวกัน\n");
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
