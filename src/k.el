(defvar k-classes
  '("class" "assoc"
    ))

(defvar k-variables
  '("var" "val" "part" "ordered" "unique"
    ))

(defvar k-keywords
  '("req" "type" "package" "import" "annotation" 
    "forall" "extends" "fun" "pre" "post" "is" "as"
    "end" "while" "if" "for" "match" 
    "forall" "with" "do" "then" "else" "in" "exists"
    "isin" "!isin" "subset" "psubset" "union" "inter" 
    "assert" "continue" "break" "return" "$result" "case" "this" 
    ))

(defvar k-sysml-keywords
  '("view" "viewpoint" "block" "constraint" "relationship" "step" "flow"
    "behavior"
    ))

(defvar k-constants 
  '("true" "false"
    ))

(defvar k-collection-kind
  '("Set" "Seq" "Bag" "Tuple"
    ))

(defvar k-types
  '("Int" "Char" "Real" "String" "Unit" "Bool"
    ))

(defvar k-tab-width 4 "Width of a tab for K mode")

;; syntax table
(defvar k-syntax-table nil "Syntax table for `k-mode'.")
(setq k-syntax-table 
      (let ((synTable (make-syntax-table)))
	(modify-syntax-entry ?= ". 1234" synTable)
	;;(modify-syntax-entry ?= ". 23" synTable)
	;;(modify-syntax-entry ?\n "> b" synTable)
	synTable))

(defvar k-font-lock-defaults
  `((
     ;; stuff between "
     ("\\(--.*\\)" 1 'font-lock-comment-face)
     ;;("\\(==.*\\)" 1 'font-lock-comment-face)
     ("\"\\.\\*\\?" . font-lock-string-face)
     ;; ; : , ; { } =>  @ $ = are all special elements
     ;;(":\\|,\\|;\\|{\\|}\\|=>\\|@\\|$\\|=" . font-lock-keyword-face)
     ( ,(regexp-opt k-keywords 'words) . font-lock-builtin-face)
     ( ,(regexp-opt k-classes 'words) . font-lock-function-name-face)
     ( ,(regexp-opt k-variables 'words) . font-lock-variable-name-face)
     ( ,(regexp-opt k-types 'words) . font-lock-type-face)
     ( ,(regexp-opt k-constants 'words) . font-lock-constant-face)
     ( ,(regexp-opt k-sysml-keywords 'words) . font-lock-constant-face)
     ( ,(regexp-opt k-collection-kind 'words) . font-lock-constant-face)
     )))

(define-derived-mode k-mode fundamental-mode "K script"
  "K mode is a major mode for editing K  files" :syntax-table k-syntax-table
  
  (setq font-lock-defaults k-font-lock-defaults)
  
  (when k-tab-width
    (setq tab-width k-tab-width))

;;  (modify-syntax-entry ?# "< b" k-mode-syntax-table)
;;  (modify-syntax-entry ?\n "> b" k-mode-syntax-table)
  )

(provide 'k-mode)
