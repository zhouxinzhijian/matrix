/*
 * Tencent is pleased to support the open source community by making wechat-matrix available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.tencent.matrix.trace;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import sample.tencent.matrix.R;
import sample.tencent.matrix.issue.IssueFilter;

/**
 * Created by caichongyang on 2017/11/14.
 */

public class TestInflateAndTraversalActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getIntent().getBooleanExtra("test_flatted", false)){
            if(getIntent().getBooleanExtra("test_flatted_less", false)){
                setContentView(R.layout.test_inflate_and_traversal_layout_flatted_less);
                Toast.makeText(this, "扁平布局更少", Toast.LENGTH_SHORT).show();
            } else {
                setContentView(R.layout.test_inflate_and_traversal_layout_flatted);
                Toast.makeText(this, "扁平布局", Toast.LENGTH_SHORT).show();
            }
        } else {
            setContentView(R.layout.test_inflate_and_traversal_layout_nested);
            Toast.makeText(this, "嵌套布局", Toast.LENGTH_SHORT).show();
        }
    }
}
