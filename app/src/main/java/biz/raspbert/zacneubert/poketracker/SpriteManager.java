package biz.raspbert.zacneubert.poketracker;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import biz.raspbert.zacneubert.poketracker.Settings.CheckboxSetting_AlternateSprites;

/**
 * Created by zneubert on 7/13/16.
 */
public class SpriteManager {
    private static final Map<Integer, Integer> allSprites = new HashMap<>();
    static {
        allSprites.put(1,R.drawable.p1);
        allSprites.put(2,R.drawable.p2);
        allSprites.put(3,R.drawable.p3);
        allSprites.put(4,R.drawable.p4);
        allSprites.put(5,R.drawable.p5);
        allSprites.put(6,R.drawable.p6);
        allSprites.put(7,R.drawable.p7);
        allSprites.put(8,R.drawable.p8);
        allSprites.put(9,R.drawable.p9);
        allSprites.put(10,R.drawable.p10);
        allSprites.put(11,R.drawable.p11);
        allSprites.put(12,R.drawable.p12);
        allSprites.put(13,R.drawable.p13);
        allSprites.put(14,R.drawable.p14);
        allSprites.put(15,R.drawable.p15);
        allSprites.put(16,R.drawable.p16);
        allSprites.put(17,R.drawable.p17);
        allSprites.put(18,R.drawable.p18);
        allSprites.put(19,R.drawable.p19);
        allSprites.put(20,R.drawable.p20);
        allSprites.put(21,R.drawable.p21);
        allSprites.put(22,R.drawable.p22);
        allSprites.put(23,R.drawable.p23);
        allSprites.put(24,R.drawable.p24);
        allSprites.put(25,R.drawable.p25);
        allSprites.put(26,R.drawable.p26);
        allSprites.put(27,R.drawable.p27);
        allSprites.put(28,R.drawable.p28);
        allSprites.put(29,R.drawable.p29);
        allSprites.put(30,R.drawable.p30);
        allSprites.put(31,R.drawable.p31);
        allSprites.put(32,R.drawable.p32);
        allSprites.put(33,R.drawable.p33);
        allSprites.put(34,R.drawable.p34);
        allSprites.put(35,R.drawable.p35);
        allSprites.put(36,R.drawable.p36);
        allSprites.put(37,R.drawable.p37);
        allSprites.put(38,R.drawable.p38);
        allSprites.put(39,R.drawable.p39);
        allSprites.put(40,R.drawable.p40);
        allSprites.put(41,R.drawable.p41);
        allSprites.put(42,R.drawable.p42);
        allSprites.put(43,R.drawable.p43);
        allSprites.put(44,R.drawable.p44);
        allSprites.put(45,R.drawable.p45);
        allSprites.put(46,R.drawable.p46);
        allSprites.put(47,R.drawable.p47);
        allSprites.put(48,R.drawable.p48);
        allSprites.put(49,R.drawable.p49);
        allSprites.put(50,R.drawable.p50);
        allSprites.put(51,R.drawable.p51);
        allSprites.put(52,R.drawable.p52);
        allSprites.put(53,R.drawable.p53);
        allSprites.put(54,R.drawable.p54);
        allSprites.put(55,R.drawable.p55);
        allSprites.put(56,R.drawable.p56);
        allSprites.put(57,R.drawable.p57);
        allSprites.put(58,R.drawable.p58);
        allSprites.put(59,R.drawable.p59);
        allSprites.put(60,R.drawable.p60);
        allSprites.put(61,R.drawable.p61);
        allSprites.put(62,R.drawable.p62);
        allSprites.put(63,R.drawable.p63);
        allSprites.put(64,R.drawable.p64);
        allSprites.put(65,R.drawable.p65);
        allSprites.put(66,R.drawable.p66);
        allSprites.put(67,R.drawable.p67);
        allSprites.put(68,R.drawable.p68);
        allSprites.put(69,R.drawable.p69);
        allSprites.put(70,R.drawable.p70);
        allSprites.put(71,R.drawable.p71);
        allSprites.put(72,R.drawable.p72);
        allSprites.put(73,R.drawable.p73);
        allSprites.put(74,R.drawable.p74);
        allSprites.put(75,R.drawable.p75);
        allSprites.put(76,R.drawable.p76);
        allSprites.put(77,R.drawable.p77);
        allSprites.put(78,R.drawable.p78);
        allSprites.put(79,R.drawable.p79);
        allSprites.put(80,R.drawable.p80);
        allSprites.put(81,R.drawable.p81);
        allSprites.put(82,R.drawable.p82);
        allSprites.put(83,R.drawable.p83);
        allSprites.put(84,R.drawable.p84);
        allSprites.put(85,R.drawable.p85);
        allSprites.put(86,R.drawable.p86);
        allSprites.put(87,R.drawable.p87);
        allSprites.put(88,R.drawable.p88);
        allSprites.put(89,R.drawable.p89);
        allSprites.put(90,R.drawable.p90);
        allSprites.put(91,R.drawable.p91);
        allSprites.put(92,R.drawable.p92);
        allSprites.put(93,R.drawable.p93);
        allSprites.put(94,R.drawable.p94);
        allSprites.put(95,R.drawable.p95);
        allSprites.put(96,R.drawable.p96);
        allSprites.put(97,R.drawable.p97);
        allSprites.put(98,R.drawable.p98);
        allSprites.put(99,R.drawable.p99);
        allSprites.put(100,R.drawable.p100);
        allSprites.put(101,R.drawable.p101);
        allSprites.put(102,R.drawable.p102);
        allSprites.put(103,R.drawable.p103);
        allSprites.put(104,R.drawable.p104);
        allSprites.put(105,R.drawable.p105);
        allSprites.put(106,R.drawable.p106);
        allSprites.put(107,R.drawable.p107);
        allSprites.put(108,R.drawable.p108);
        allSprites.put(109,R.drawable.p109);
        allSprites.put(110,R.drawable.p110);
        allSprites.put(111,R.drawable.p111);
        allSprites.put(112,R.drawable.p112);
        allSprites.put(113,R.drawable.p113);
        allSprites.put(114,R.drawable.p114);
        allSprites.put(115,R.drawable.p115);
        allSprites.put(116,R.drawable.p116);
        allSprites.put(117,R.drawable.p117);
        allSprites.put(118,R.drawable.p118);
        allSprites.put(119,R.drawable.p119);
        allSprites.put(120,R.drawable.p120);
        allSprites.put(121,R.drawable.p121);
        allSprites.put(122,R.drawable.p122);
        allSprites.put(123,R.drawable.p123);
        allSprites.put(124,R.drawable.p124);
        allSprites.put(125,R.drawable.p125);
        allSprites.put(126,R.drawable.p126);
        allSprites.put(127,R.drawable.p127);
        allSprites.put(128,R.drawable.p128);
        allSprites.put(129,R.drawable.p129);
        allSprites.put(130,R.drawable.p130);
        allSprites.put(131,R.drawable.p131);
        allSprites.put(132,R.drawable.p132);
        allSprites.put(133,R.drawable.p133);
        allSprites.put(134,R.drawable.p134);
        allSprites.put(135,R.drawable.p135);
        allSprites.put(136,R.drawable.p136);
        allSprites.put(137,R.drawable.p137);
        allSprites.put(138,R.drawable.p138);
        allSprites.put(139,R.drawable.p139);
        allSprites.put(140,R.drawable.p140);
        allSprites.put(141,R.drawable.p141);
        allSprites.put(142,R.drawable.p142);
        allSprites.put(143,R.drawable.p143);
        allSprites.put(144,R.drawable.p144);
        allSprites.put(145,R.drawable.p145);
        allSprites.put(146,R.drawable.p146);
        allSprites.put(147,R.drawable.p147);
        allSprites.put(148,R.drawable.p148);
        allSprites.put(149,R.drawable.p149);
        allSprites.put(150,R.drawable.p150);
        allSprites.put(151,R.drawable.p151);
    }

    private static final Map<Integer, Integer> altSprites = new HashMap<>();
    static {
        /*for(int i=1; i<=151; i++) {
            altSprites.put(i, R.drawable.substitute);
        }*/
        altSprites.put(1,R.raw.n1);
        altSprites.put(2,R.raw.n2);
        altSprites.put(3,R.raw.n3);
        altSprites.put(4,R.raw.n4);
        altSprites.put(5,R.raw.n5);
        altSprites.put(6,R.raw.n6);
        altSprites.put(7,R.raw.n7);
        altSprites.put(8,R.raw.n8);
        altSprites.put(9,R.raw.n9);
        altSprites.put(10,R.raw.n10);
        altSprites.put(11,R.raw.n11);
        altSprites.put(12,R.raw.n12);
        altSprites.put(13,R.raw.n13);
        altSprites.put(14,R.raw.n14);
        altSprites.put(15,R.raw.n15);
        altSprites.put(16,R.raw.n16);
        altSprites.put(17,R.raw.n17);
        altSprites.put(18,R.raw.n18);
        altSprites.put(19,R.raw.n19);
        altSprites.put(20,R.raw.n20);
        altSprites.put(21,R.raw.n21);
        altSprites.put(22,R.raw.n22);
        altSprites.put(23,R.raw.n23);
        altSprites.put(24,R.raw.n24);
        altSprites.put(25,R.raw.n25);
        altSprites.put(26,R.raw.n26);
        altSprites.put(27,R.raw.n27);
        altSprites.put(28,R.raw.n28);
        altSprites.put(29,R.raw.n29);
        altSprites.put(30,R.raw.n30);
        altSprites.put(31,R.raw.n31);
        altSprites.put(32,R.raw.n32);
        altSprites.put(33,R.raw.n33);
        altSprites.put(34,R.raw.n34);
        altSprites.put(35,R.raw.n35);
        altSprites.put(36,R.raw.n36);
        altSprites.put(37,R.raw.n37);
        altSprites.put(38,R.raw.n38);
        altSprites.put(39,R.raw.n39);
        altSprites.put(40,R.raw.n40);
        altSprites.put(41,R.raw.n41);
        altSprites.put(42,R.raw.n42);
        altSprites.put(43,R.raw.n43);
        altSprites.put(44,R.raw.n44);
        altSprites.put(45,R.raw.n45);
        altSprites.put(46,R.raw.n46);
        altSprites.put(47,R.raw.n47);
        altSprites.put(48,R.raw.n48);
        altSprites.put(49,R.raw.n49);
        altSprites.put(50,R.raw.n50);
        altSprites.put(51,R.raw.n51);
        altSprites.put(52,R.raw.n52);
        altSprites.put(53,R.raw.n53);
        altSprites.put(54,R.raw.n54);
        altSprites.put(55,R.raw.n55);
        altSprites.put(56,R.raw.n56);
        altSprites.put(57,R.raw.n57);
        altSprites.put(58,R.raw.n58);
        altSprites.put(59,R.raw.n59);
        altSprites.put(60,R.raw.n60);
        altSprites.put(61,R.raw.n61);
        altSprites.put(62,R.raw.n62);
        altSprites.put(63,R.raw.n63);
        altSprites.put(64,R.raw.n64);
        altSprites.put(65,R.raw.n65);
        altSprites.put(66,R.raw.n66);
        altSprites.put(67,R.raw.n67);
        altSprites.put(68,R.raw.n68);
        altSprites.put(69,R.raw.n69);
        altSprites.put(70,R.raw.n70);
        altSprites.put(71,R.raw.n71);
        altSprites.put(72,R.raw.n72);
        altSprites.put(73,R.raw.n73);
        altSprites.put(74,R.raw.n74);
        altSprites.put(75,R.raw.n75);
        altSprites.put(76,R.raw.n76);
        altSprites.put(77,R.raw.n77);
        altSprites.put(78,R.raw.n78);
        altSprites.put(79,R.raw.n79);
        altSprites.put(80,R.raw.n80);
        altSprites.put(81,R.raw.n81);
        altSprites.put(82,R.raw.n82);
        altSprites.put(83,R.raw.n83);
        altSprites.put(84,R.raw.n84);
        altSprites.put(85,R.raw.n85);
        altSprites.put(86,R.raw.n86);
        altSprites.put(87,R.raw.n87);
        altSprites.put(88,R.raw.n88);
        altSprites.put(89,R.raw.n89);
        altSprites.put(90,R.raw.n90);
        altSprites.put(91,R.raw.n91);
        altSprites.put(92,R.raw.n92);
        altSprites.put(93,R.raw.n93);
        altSprites.put(94,R.raw.n94);
        altSprites.put(95,R.raw.n95);
        altSprites.put(96,R.raw.n96);
        altSprites.put(97,R.raw.n97);
        altSprites.put(98,R.raw.n98);
        altSprites.put(99,R.raw.n99);
        altSprites.put(100,R.raw.n100);
        altSprites.put(101,R.raw.n101);
        altSprites.put(102,R.raw.n102);
        altSprites.put(103,R.raw.n103);
        altSprites.put(104,R.raw.n104);
        altSprites.put(105,R.raw.n105);
        altSprites.put(106,R.raw.n106);
        altSprites.put(107,R.raw.n107);
        altSprites.put(108,R.raw.n108);
        altSprites.put(109,R.raw.n109);
        altSprites.put(110,R.raw.n110);
        altSprites.put(111,R.raw.n111);
        altSprites.put(112,R.raw.n112);
        altSprites.put(113,R.raw.n113);
        altSprites.put(114,R.raw.n114);
        altSprites.put(115,R.raw.n115);
        altSprites.put(116,R.raw.n116);
        altSprites.put(117,R.raw.n117);
        altSprites.put(118,R.raw.n118);
        altSprites.put(119,R.raw.n119);
        altSprites.put(120,R.raw.n120);
        altSprites.put(121,R.raw.n121);
        altSprites.put(122,R.raw.n122);
        altSprites.put(123,R.raw.n123);
        altSprites.put(124,R.raw.n124);
        altSprites.put(125,R.raw.n125);
        altSprites.put(126,R.raw.n126);
        altSprites.put(127,R.raw.n127);
        altSprites.put(128,R.raw.n128);
        altSprites.put(129,R.raw.n129);
        altSprites.put(130,R.raw.n130);
        altSprites.put(131,R.raw.n131);
        altSprites.put(132,R.raw.n132);
        altSprites.put(133,R.raw.n133);
        altSprites.put(134,R.raw.n134);
        altSprites.put(135,R.raw.n135);
        altSprites.put(136,R.raw.n136);
        altSprites.put(137,R.raw.n137);
        altSprites.put(138,R.raw.n138);
        altSprites.put(139,R.raw.n139);
        altSprites.put(140,R.raw.n140);
        altSprites.put(141,R.raw.n141);
        altSprites.put(142,R.raw.n142);
        altSprites.put(143,R.raw.n143);
        altSprites.put(144,R.raw.n144);
        altSprites.put(145,R.raw.n145);
        altSprites.put(146,R.raw.n146);
        altSprites.put(147,R.raw.n147);
        altSprites.put(148,R.raw.n148);
        altSprites.put(149,R.raw.n149);
        altSprites.put(150,R.raw.n150);
        altSprites.put(151,R.raw.n151);
    }

    public static Map<Integer, Integer> allSprites(Context context) {
        if(((boolean) new CheckboxSetting_AlternateSprites().getSavedValueOrDefault(context))) {
            return altSprites;
        }
        return allSprites;
    }
}
