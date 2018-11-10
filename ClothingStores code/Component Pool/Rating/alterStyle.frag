Fragment Rating-AlterStyle { 
   Action: add
   Priority: high
   FragmentationPoints: fline
   PointBracketsLan: css
   Destinations: BasicViewsGeneral-Style
   SourceCode: [ALTERCODE-FRAG]@import url(//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css);[/ALTERCODE-FRAG]
}

Fragment Rating-AlterStyle2 { 
   Action: add
   Priority: high
   FragmentationPoints: lline
   PointBracketsLan: css
   Destinations: BasicViewsGeneral-Style
   SourceCode: [ALTERCODE-FRAG]fieldset, label { margin: 0; padding: 0; }

.rating { 
  border: none;
  float: left;
}

.rating > input { display: none; } 
.rating > label:before { 
  margin: 5px;
  font-size: 1.25em;
  font-family: FontAwesome;
  display: inline-block;
  content: "\f005";
}

.rating > .half:before { 
  content: "\f089";
  position: absolute;
}

.rating > label { 
  color: #ddd; 
 float: right; 
}

.rating > input:checked ~ label, /* show gold star when clicked */
.rating:not(:checked) > label:hover, /* hover current star */
.rating:not(:checked) > label:hover ~ label { color: #FFD700;  } /* hover previous stars in list */

.rating > input:checked + label:hover, /* hover current star when changing rating */
.rating > input:checked ~ label:hover,
.rating > label:hover ~ input:checked ~ label, /* lighten current selection */
.rating > input:checked ~ label:hover ~ label { color: #FFED85;  }[/ALTERCODE-FRAG]
}