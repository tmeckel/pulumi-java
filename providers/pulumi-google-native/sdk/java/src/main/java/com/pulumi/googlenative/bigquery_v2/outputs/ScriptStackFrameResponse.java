// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScriptStackFrameResponse {
    /**
     * @return One-based end column.
     * 
     */
    private final Integer endColumn;
    /**
     * @return One-based end line.
     * 
     */
    private final Integer endLine;
    /**
     * @return Name of the active procedure, empty if in a top-level script.
     * 
     */
    private final String procedureId;
    /**
     * @return One-based start column.
     * 
     */
    private final Integer startColumn;
    /**
     * @return One-based start line.
     * 
     */
    private final Integer startLine;
    /**
     * @return Text of the current statement/expression.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private ScriptStackFrameResponse(
        @CustomType.Parameter("endColumn") Integer endColumn,
        @CustomType.Parameter("endLine") Integer endLine,
        @CustomType.Parameter("procedureId") String procedureId,
        @CustomType.Parameter("startColumn") Integer startColumn,
        @CustomType.Parameter("startLine") Integer startLine,
        @CustomType.Parameter("text") String text) {
        this.endColumn = endColumn;
        this.endLine = endLine;
        this.procedureId = procedureId;
        this.startColumn = startColumn;
        this.startLine = startLine;
        this.text = text;
    }

    /**
     * @return One-based end column.
     * 
     */
    public Integer endColumn() {
        return this.endColumn;
    }
    /**
     * @return One-based end line.
     * 
     */
    public Integer endLine() {
        return this.endLine;
    }
    /**
     * @return Name of the active procedure, empty if in a top-level script.
     * 
     */
    public String procedureId() {
        return this.procedureId;
    }
    /**
     * @return One-based start column.
     * 
     */
    public Integer startColumn() {
        return this.startColumn;
    }
    /**
     * @return One-based start line.
     * 
     */
    public Integer startLine() {
        return this.startLine;
    }
    /**
     * @return Text of the current statement/expression.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStackFrameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endColumn;
        private Integer endLine;
        private String procedureId;
        private Integer startColumn;
        private Integer startLine;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStackFrameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endColumn = defaults.endColumn;
    	      this.endLine = defaults.endLine;
    	      this.procedureId = defaults.procedureId;
    	      this.startColumn = defaults.startColumn;
    	      this.startLine = defaults.startLine;
    	      this.text = defaults.text;
        }

        public Builder endColumn(Integer endColumn) {
            this.endColumn = Objects.requireNonNull(endColumn);
            return this;
        }
        public Builder endLine(Integer endLine) {
            this.endLine = Objects.requireNonNull(endLine);
            return this;
        }
        public Builder procedureId(String procedureId) {
            this.procedureId = Objects.requireNonNull(procedureId);
            return this;
        }
        public Builder startColumn(Integer startColumn) {
            this.startColumn = Objects.requireNonNull(startColumn);
            return this;
        }
        public Builder startLine(Integer startLine) {
            this.startLine = Objects.requireNonNull(startLine);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public ScriptStackFrameResponse build() {
            return new ScriptStackFrameResponse(endColumn, endLine, procedureId, startColumn, startLine, text);
        }
    }
}
