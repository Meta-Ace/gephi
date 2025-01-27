/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
*/

package org.gephi.ui.generator.plugin;

import org.gephi.lib.validation.BetweenZeroAndOneValidator;
import org.gephi.lib.validation.PositiveNumberValidator;
import org.netbeans.validation.api.builtin.Validators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.netbeans.validation.api.ui.ValidationPanel;

/**
 * @author Mathieu Bastian
 */
public class RandomGraphPanel extends javax.swing.JPanel {

    /**
     * Creates new form RandomGraphPanel
     */
    public RandomGraphPanel() {
        initComponents();
    }

    public static ValidationPanel createValidationPanel(RandomGraphPanel innerPanel) {
        ValidationPanel validationPanel = new ValidationPanel();
        if (innerPanel == null) {
            innerPanel = new RandomGraphPanel();
        }
        validationPanel.setInnerComponent(innerPanel);

        ValidationGroup group = validationPanel.getValidationGroup();

        //Node field
        group.add(innerPanel.nodeField, Validators.REQUIRE_NON_EMPTY_STRING,
            new PositiveNumberValidator());

        //Edge field
        group.add(innerPanel.edgeField, Validators.REQUIRE_NON_EMPTY_STRING,
            new BetweenZeroAndOneValidator());

        return validationPanel;
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nodeLabel = new javax.swing.JLabel();
        edgeLabel = new javax.swing.JLabel();
        nodeField = new javax.swing.JTextField();
        edgeField = new javax.swing.JTextField();

        nodeLabel.setText(
            org.openide.util.NbBundle.getMessage(RandomGraphPanel.class, "RandomGraphPanel.nodeLabel.text")); // NOI18N

        edgeLabel.setText(
            org.openide.util.NbBundle.getMessage(RandomGraphPanel.class, "RandomGraphPanel.edgeLabel.text")); // NOI18N

        nodeField.setText(
            org.openide.util.NbBundle.getMessage(RandomGraphPanel.class, "RandomGraphPanel.nodeField.text")); // NOI18N

        edgeField.setText(
            org.openide.util.NbBundle.getMessage(RandomGraphPanel.class, "RandomGraphPanel.edgeField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nodeLabel)
                        .addComponent(edgeLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(edgeField)
                        .addComponent(nodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nodeField, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nodeLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edgeField, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edgeLabel))
                    .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
                  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField edgeField;
    protected javax.swing.JTextField nodeField;
    private javax.swing.JLabel edgeLabel;
    private javax.swing.JLabel nodeLabel;
    // End of variables declaration//GEN-END:variables
    

}
